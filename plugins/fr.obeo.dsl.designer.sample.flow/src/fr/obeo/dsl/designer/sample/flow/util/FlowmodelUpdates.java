package fr.obeo.dsl.designer.sample.flow.util;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import fr.obeo.dsl.designer.sample.flow.CapacityBound;
import fr.obeo.dsl.designer.sample.flow.DataFlow;
import fr.obeo.dsl.designer.sample.flow.DataSource;
import fr.obeo.dsl.designer.sample.flow.Fan;
import fr.obeo.dsl.designer.sample.flow.FlowElement;
import fr.obeo.dsl.designer.sample.flow.FlowElementStatus;
import fr.obeo.dsl.designer.sample.flow.FlowElementUsage;
import fr.obeo.dsl.designer.sample.flow.Powered;
import fr.obeo.dsl.designer.sample.flow.Processor;
import fr.obeo.dsl.designer.sample.flow.System;

public class FlowmodelUpdates {

	public void updateModelState(fr.obeo.dsl.designer.sample.flow.System s) {

		for (FlowElement todo : sortInTopologicalOrder(s)) {
			updateFlowBasedOnSource((FlowElement) todo, getAllElements(s));
		}
		updateFan(s);
		updateCapacityBound(s);
		updateProcessors(s);

		s.setWeight(SimulationHelper.computeWeight(s));
	}

	private void updateFan(fr.obeo.dsl.designer.sample.flow.System s) {
		Iterator<Fan> it = Iterators.filter(s.eAllContents(), Fan.class);
		while (it.hasNext()) {
			Fan f = it.next();
			if (f.getStatus() == FlowElementStatus.INACTIVE) {
				f.setConsumption(0);
			} else {
				f.setConsumption(f.getSpeed() / 100);
			}
		}
	}

	private Set<FlowElement> getAllElements(System s) {
		Set<FlowElement> r = Sets.newLinkedHashSet();
		Iterator<FlowElement> it = Iterators.filter(s.eAllContents(), FlowElement.class);
		while (it.hasNext()) {
			r.add(it.next());
		}
		return r;
	}

	private List<FlowElement> sortInTopologicalOrder(System s) {
		List<FlowElement> result = Lists.newArrayList();
		Set<FlowElement> all = Sets.newLinkedHashSet();
		Deque<FlowElement> stack = new ArrayDeque<>();
		Set<FlowElement> visited = Sets.newLinkedHashSet();
		Iterators.addAll(all, Iterators.filter(s.eAllContents(), FlowElement.class));
		Iterator<FlowElement> it = Iterators.filter(s.eAllContents(), FlowElement.class);
		while (it.hasNext()) {
			FlowElement cur = it.next();
			if (!visited.contains(cur)) {
				doTopo(cur, visited, stack, all);
			}
		}

		while (!stack.isEmpty()) {
			FlowElement todo = stack.pop();
			result.add(todo);

		}

		return result;
	}

	private void doTopo(FlowElement cur, Set<FlowElement> visited, Deque<FlowElement> stack, Set<FlowElement> all) {
		visited.add(cur);

		Set<FlowElement> adjacents = Sets.newLinkedHashSet();
		for (FlowElement flowElement : all) {
			if (flowElement instanceof DataFlow && ((DataFlow) flowElement).getSource() == cur) {
				adjacents.add(flowElement);
			}
			if (cur instanceof DataFlow && ((DataFlow) cur).getTarget() == flowElement) {
				adjacents.add(flowElement);
			}
		}
		for (FlowElement flowElement : adjacents) {
			if (!visited.contains(flowElement)) {
				doTopo(flowElement, visited, stack, all);
			}
		}
		stack.push(cur);

	}

	private void updateCapacityBound(System s) {
		Iterator<CapacityBound> it = Iterators.filter(s.eAllContents(), CapacityBound.class);
		while (it.hasNext()) {
			CapacityBound bounded = it.next();
			if (bounded.getStatus() == FlowElementStatus.ACTIVE) {
				if (bounded.getLoad() <= bounded.getCapacity() * 1.15) {
					bounded.setUsage(FlowElementUsage.STANDARD);
				} else if (bounded.getLoad() >= bounded.getCapacity() * 1.5) {
					bounded.setUsage(FlowElementUsage.OVER);
				} else {
					bounded.setUsage(FlowElementUsage.HIGH);
				}
			} else {
				bounded.setUsage(FlowElementUsage.UNUSED);
			}
		}

	}

	private void updateFlowBasedOnSource(FlowElement element, Set<FlowElement> all) {

		if (element instanceof DataFlow) {
			if (((DataFlow) element).getSource() instanceof DataSource) {
				((DataFlow) element).setLoad(((DataSource) ((DataFlow) element).getSource()).getVolume());
			}
			if (((DataFlow) element).getSource() instanceof Processor) {
				((DataFlow) element).setLoad(((Processor) ((DataFlow) element).getSource()).getVolume());
			}
		}

		if (element instanceof Processor) {
			int incomingSum = 0;
			for (DataFlow flow : Iterables.filter(all, DataFlow.class)) {
				if (flow.getTarget() == element) {
					incomingSum += flow.getLoad();
				}
			}
			((Processor) element).setLoad(Integer.valueOf(incomingSum));
			((Processor) element).setVolume(Integer.valueOf(incomingSum));
		}

	}

	private void updateProcessors(System s) {

		int sum = 0;
		for (FlowElement e : s.getElements()) {
			if (e instanceof System) {
				updateProcessors((System) e);
			}
			if (e instanceof Processor) {
				Processor p = (Processor) e;
				if (p.getStatus() == FlowElementStatus.INACTIVE) {
					p.setConsumption(0);
				} else {
					p.setConsumption(p.getCapacity() * 10);
				}

			}
			if (e instanceof Powered) {
				sum += ((Powered) e).getConsumption();
			}
		}
		s.setTemperature(SimulationHelper.computeTemperature(s));
		s.setConsumption(sum);
	}

}

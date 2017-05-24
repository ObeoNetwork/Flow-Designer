package fr.obeo.dsl.designer.sample.flow.design;

import fr.obeo.dsl.designer.sample.flow.Processor;

public class FlowServices {
	public int sizeFromCapacity(Processor s) {
		return Double.valueOf(Math.sqrt(s.getCapacity()) * 2).intValue();
	}
}

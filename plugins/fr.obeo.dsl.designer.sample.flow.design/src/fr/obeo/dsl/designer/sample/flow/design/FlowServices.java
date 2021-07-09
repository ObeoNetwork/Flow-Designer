package fr.obeo.dsl.designer.sample.flow.design;

import org.eclipse.emf.ecore.EObject;

import fr.obeo.dsl.designer.sample.flow.CapacityBound;
import fr.obeo.dsl.designer.sample.flow.Named;
import fr.obeo.dsl.designer.sample.flow.Processor;
import fr.obeo.dsl.designer.sample.flow.System;

public class FlowServices {
	public int sizeFromCapacity(Processor s) {
		return Double.valueOf(Math.sqrt(s.getCapacity()) * 2).intValue();
	}

	public Named editNameAndOptionallyCapacity(Named n, String typedString) {
		int indexSep = typedString.indexOf(':');
		int capacity = 0;
		if (n instanceof CapacityBound) {
			capacity = ((CapacityBound) n).getCapacity();
		}
		String name = typedString;
		if (indexSep != -1) {
			name = typedString.substring(0, indexSep - 1);
			String capacityStr = typedString.substring(indexSep + 1).trim();
			try {
				capacity = Integer.valueOf(capacityStr);
			} catch (NumberFormatException e) {
				// ignore
			}
		}
		if (n instanceof CapacityBound) {
			((CapacityBound) n).setCapacity(capacity);
		}

		if (name != null && name.length() > 0) {
			name = name.replace(' ', '_');
			if (!name.equals(n.getName())) {
				/*
				 * TODO refactor String attributes?
				 */
			}
			n.setName(name);
		}
		return n;
	}

	public System getRootElement(EObject o) {
		EObject rootObject = o;
		EObject container = rootObject.eContainer();
		while (container != null) {
			rootObject = container;
			container = rootObject.eContainer();
		}
		if (rootObject instanceof System) {
			return (System) rootObject;
		}
		return null;
	}
}

package fr.obeo.dsl.designer.sample.flow.design;

import fr.obeo.dsl.designer.sample.flow.CapacityBound;
import fr.obeo.dsl.designer.sample.flow.Named;
import fr.obeo.dsl.designer.sample.flow.Processor;

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
			name = typedString.substring(0, indexSep);
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
}

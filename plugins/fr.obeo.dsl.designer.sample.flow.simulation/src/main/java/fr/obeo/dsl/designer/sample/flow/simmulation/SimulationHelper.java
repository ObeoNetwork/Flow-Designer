/**
 * Copyright  2010 Obeo. All Rights Reserved.
 *
 * This file is part of Obeo Designer.
 *
 * This software and the attached documentation are the exclusive ownership
 * of its authors and was conceded to the profit of Obeo SARL.
 * This software and the attached documentation are protected under the rights
 * of intellectual ownership, including the section "Titre II  Droits des auteurs (Articles L121-1, L123-12)"
 * By installing this software, you acknowledge being aware of this rights and
 * accept them, and as a consequence you must:
 * - be in possession of a valid license of use conceded by Obeo only.
 * - agree that you have read, understood, and will comply with the license terms and conditions.
 * - agree not to do anything that could conflict with intellectual ownership owned by Obeo or its beneficiaries
 * or the authors of this software
 *
 * Should you not agree with these terms, you must stop to use this software and give it back to its legitimate owner.
 *
 * Acceleo and Obeo are trademarks owned by Obeo.
 */
package fr.obeo.dsl.designer.sample.flow.simmulation;

import fr.obeo.dsl.designer.sample.flow.DataFlow;
import fr.obeo.dsl.designer.sample.flow.Fan;
import fr.obeo.dsl.designer.sample.flow.FlowElement;
import fr.obeo.dsl.designer.sample.flow.FlowElementStatus;
import fr.obeo.dsl.designer.sample.flow.FlowElementUsage;
import fr.obeo.dsl.designer.sample.flow.FlowTarget;
import fr.obeo.dsl.designer.sample.flow.Powered;
import fr.obeo.dsl.designer.sample.flow.Processor;

public class SimulationHelper {

	public static int computeLoad(FlowTarget processor) {
		int result = 0;
		for (DataFlow flow : processor.getIncomingFlows()) {
			result += flow.getLoad();
		}
		return result;
	}

	public static int computeConsumption(fr.obeo.dsl.designer.sample.flow.System system) {
		int result = 0;
		for (FlowElement element : system.getElements()) {
			if (element instanceof Powered && element.getStatus() == FlowElementStatus.ACTIVE) {
				result += ((Powered) element).getConsumption();
			}
		}
		return result;
	}

	public static int computeWeight(fr.obeo.dsl.designer.sample.flow.System system) {
		int result = 0;
		for (FlowElement element : system.getElements()) {
			if (element instanceof Processor) {
				result += ((Processor) element).getWeight();
			} else if (element instanceof Fan) {
				result += ((Fan) element).getWeight();
			}
		}
		return result;
	}

	public static float DEGREE_PER_WATT = 0.2f;

	public static float DEGREE_PER_RPM = 0.01f;

	public static int computeTemperature(fr.obeo.dsl.designer.sample.flow.System system) {

		int temperature = 0;
		for (FlowElement element : system.getElements()) {
			if (element.getStatus() == FlowElementStatus.ACTIVE) {
				float ratio = getRatioFromUsage(element.getUsage());
				if (element instanceof Powered) {
					temperature += ((Powered) element).getConsumption() * DEGREE_PER_WATT * ratio;
				}
			}
		}
		int windTotal = 0;
		int nbFans = 0;
		for (FlowElement element : system.getElements()) {
			if (element.getStatus() == FlowElementStatus.ACTIVE && element instanceof Fan) {
				nbFans += 1;
				windTotal += ((Fan) element).getSpeed();
			}
		}
		if (nbFans > 0) {
			int medFan = Math.round(windTotal / nbFans);
			int temperatureRemoval = Math.round(medFan * DEGREE_PER_RPM);
			temperature -= temperatureRemoval;
		}

		return temperature;
	}

	private static float getRatioFromUsage(FlowElementUsage usage) {
		float result = 0;
		if (usage == FlowElementUsage.HIGH) {
			result = 2f;
		} else if (usage == FlowElementUsage.OVER) {
			result = 2.5f;
		} else if (usage == FlowElementUsage.LOW) {
			result = 0.5f;
		} else if (usage == FlowElementUsage.STANDARD) {
			result = 1f;
		} else if (usage == FlowElementUsage.UNUSED) {
			result = 0f;
		}
		return result;
	}

}

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

package fr.obeo.dsl.designer.sample.flow.presentation;

import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import fr.obeo.dsl.designer.sample.flow.CapacityBound;
import fr.obeo.dsl.designer.sample.flow.FlowElementUsage;

public class CapacityBoundWrappingLabelProvider extends DecoratingLabelProvider {

	
	private final Color over = new Color(Display.getDefault(),239, 41, 41);
	private final Color high = new Color(Display.getDefault(),252, 175, 62); 
	private final Color normal =  new Color(Display.getDefault(),138, 226, 52);
	private final Color low =new Color(Display.getDefault(),114, 159, 207);
	private final Color unused = new Color(Display.getDefault(),136, 138, 133);

	public CapacityBoundWrappingLabelProvider(ILabelProvider provider,
			ILabelDecorator decorator) {
		super(provider, decorator);
	}

	@Override
	public Color getForeground(Object element) {
		if (element instanceof CapacityBound) {
			Color col = capacityBoundColor(((CapacityBound) element).getUsage());
			if (col != null)
				return col;
		}
		return super.getForeground(element);
	}

	private Color capacityBoundColor(FlowElementUsage usage) {
		if (usage == FlowElementUsage.HIGH)
			return high;
		else if (usage == FlowElementUsage.OVER)
			return over;
		else if (usage == FlowElementUsage.STANDARD)
			return normal;
		else if (usage == FlowElementUsage.LOW)
			return low;
		else if (usage == FlowElementUsage.UNUSED)
			return unused;
		return null;
	}
	
	@Override
	public void dispose() {	
		super.dispose();
		high.dispose();		
		over.dispose();
		normal.dispose();
		low.dispose();
		unused.dispose();
		
	}

}

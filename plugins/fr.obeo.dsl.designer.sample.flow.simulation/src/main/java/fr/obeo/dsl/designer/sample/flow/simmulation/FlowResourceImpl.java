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

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class FlowResourceImpl extends XMIResourceImpl {

    public FlowResourceImpl(URI uri) {
        super(uri);
    }

    @Override
    public void load(Map<?, ?> options) throws IOException {
        super.load(options);
        installSimulation();
        getOrCreateSimulation().update();
    }

    @Override
    public void save(Map<?, ?> options) throws IOException {

        super.save(options);

    }

    private void installSimulation() {
        getOrCreateSimulation().init(getContents());
        try {
            getOrCreateSimulation().start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doUnload() {
        super.doUnload();
        getOrCreateSimulation().stop();
        eAdapters().remove(getOrCreateSimulation());
    }

    private SimulationAdapter getOrCreateSimulation() {
        for (Adapter adapt : eAdapters()) {
            if (adapt instanceof SimulationAdapter)
                return (SimulationAdapter) adapt;
        }
        SimulationAdapter newOne = new SimulationAdapter();
        eAdapters().add(newOne);
        return newOne;
    }

}

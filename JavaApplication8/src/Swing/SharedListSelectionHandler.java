/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author jens.papenhagen
 */
class SharedListSelectionHandler implements ListSelectionListener {

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        JList list = (JList) listSelectionEvent.getSource();
        int selections[] = list.getSelectedIndices();
        Object selectionValues[] = list.getSelectedValues();
        for (int i = 0; i < selections.length; i++) {
            if (!listSelectionEvent.getValueIsAdjusting()) {
                System.out.println("ID " + selections[i] + " Value: " + selectionValues[i] + " ");

            }

        }
    }

}

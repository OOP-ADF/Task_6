/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author abdulnursahid
 */
public interface View {
        public void addListener(ActionListener e);

        public JPanel getMainPanel();
    }
     


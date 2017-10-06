/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenceproject;

import javax.swing.event.*;

import referenceproject.ReferenceProject;
import static referenceproject.ReferenceProject.save;

/**
 *
 * @author User
 */
public class TextAreaChanged implements DocumentListener { // DocumentListener checks a JTextArea of JTextPanel for input
    
    public static boolean saveAble = false;
    
    @Override
    public void insertUpdate(DocumentEvent e) { // When typed in the area
    	if (saveAble) {
			save.setEnabled(true);
			ReferenceProject.reload(save);
		} else {
			save.setEnabled(false);
			ReferenceProject.reload(save);
			saveAble = true;
		}
    }
    @Override
    public void removeUpdate(DocumentEvent e) { // When removing things from the area
    	if (saveAble) {
			save.setEnabled(true);
			ReferenceProject.reload(save);
		} else {
			save.setEnabled(false);
			ReferenceProject.reload(save);
			saveAble = true;
		}
    }
    @Override
    public void changedUpdate(DocumentEvent e) { // ** NEED TO TEST **
        //changed = true;
        System.out.println("changed");
    }
}
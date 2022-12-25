/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sources;

import javax.swing.JOptionPane;

/**
 *
 * @author Ishihara Satoaki
 */
public class CommonSources {
    
    
    public void backOption(){
        JOptionPane.showMessageDialog(null, "Return to start.");
    }
    
    public void quitornot(){
        String[] boo = {"Yes", "no"};
        Integer option = JOptionPane.showOptionDialog(null, "Are you sure you want to exit this page?", "", 0, 1, null, boo, boo[0]);
        if (option == 0){
            JOptionPane.showMessageDialog(null, "Thank you. Take care, and bye-bye.");
            System.exit(0);
        } 
    }
}

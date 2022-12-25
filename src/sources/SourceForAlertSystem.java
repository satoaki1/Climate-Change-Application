package sources;

import javax.swing.JOptionPane;

/**
 *
 * @author Cheong Mei Poh
 */
public class SourceForAlertSystem {
    public static void flood(){
        JOptionPane.showMessageDialog(null, 
                    "Warning! Flood is occurring in Kuala Lumpur!! "
                  + "Please track the onward news reports, be prepared for escape and take care of yourself.", 
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
    }
    
    public static void earthquake(){
        JOptionPane.showMessageDialog(null, 
                    "Warning! Earthquake is occurring in Manila!! "
                  + "Please track the onward news reports, be prepared for escape and take care of yourself.",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
    }
    
    public static void volcano(){
        JOptionPane.showMessageDialog(null, 
                    "Warning! Volcano is occurring in Jakarta!! "
                  + "Please track the onward news reports, be prepared for escape and take care of yourself.",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
    }
    
    public static void monsoon(){
        JOptionPane.showMessageDialog(null, 
                    "Warning! Monsoon is occurring in Bangkok! "
                  + "Please track the onward news reports, be prepared for escape and take care of yourself.", 
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
    }
    
    public static void typhoon(){
        JOptionPane.showMessageDialog(null, 
                    "Warning! Typhoon is occurring in Tokyo!! "
                  + "Please track the onward news reports, be prepared for escape and take care of yourself.", 
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE); 
    }
}

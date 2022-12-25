package sources;

import javax.swing.JOptionPane;

/**
 *
 * @author Ishihara Satoaki
 */
public class SourceForHowToPrepareFor {
    public static void flood(){
        JOptionPane.showMessageDialog(null, 
                "Make a plan for your household, including your pets, so that you and your family know what to do, where to go, and what you will need to protect yourselves from flooding. ", 
                "How to protect yourself from flood", 
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                "Learn and practice evacuation routes, shelter plans, and flash flood response. ", 
                "How to protect yourself from flood", 
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                "Gather supplies, including non-perishable foods, cleaning supplies, and water for several days, in case you must leave immediately or if services are cut off in your area.",
                "How to protect yourself from flood", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void earthquake(){
        JOptionPane.showMessageDialog(null, 
                "Create a family emergency communications plan that has an out-of-state contact. "
              + "Plan where to meet if you get separated. ",
                "How to protect yourself from earthquake", 
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                "Make a supply kit that includes enough food and water for several days, a flashlight, a fire extinguisher and a whistle.", 
                "How to protect yourself from earthquake", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void volcano(){
        JOptionPane.showMessageDialog(null, 
                "Follow evacuation or shelter orders. If advised to evacuate, do so early. "
              + "Limit your time outdoors and use a dust mask or cloth mask as a last resort if you must be outside. ",
                "How to protect yourself from volcano", 
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                "Avoid areas downwind and river valleys downstream of the volcano. "
              + "Take temporary shelter from volcanic ash in the location where you are. ", 
                "How to protect yourself from volcano", 
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                "Cover ventilation openings and seal doors and windows. "
              + "Avoid driving in heavy ash. If you must drive, keep the windows up and do not use the air conditioning system.", 
                "How to protect yourself from volcano", 
                JOptionPane.INFORMATION_MESSAGE);        
    }
    
    public static void typhoon(){
        JOptionPane.showMessageDialog(null, 
                "Do not wash your hands, do not take a shower, do not wash dishes, and do not do laundry. "
              + "Plumbing and bathroom fixtures can conduct electricity. ",
                "How to protect yourself from monsoon", 
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                "Keep away from windows. "
              + "If you are caught outdoors in a thunderstorm, and safe shelter is not available, find a low spot away from trees, fences, and poles.", 
                "How to protect yourself from monsoon", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void monsoon(){
        JOptionPane.showMessageDialog(null, 
                "Typhoons can cause catastrophic damage to coastlines and several hundred miles inland. ",
                "How to protect yourself from typhoon", 
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                "Be sure trees and shrubs around your home are well trimmed so they are more wind resistant. ", 
                "How to protect yourself from typhoon", 
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                "Reinforce your garage doors; if wind enters a garage it can cause dangerous and expensive structural damage.", 
                "How to protect yourself from typhoon", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}

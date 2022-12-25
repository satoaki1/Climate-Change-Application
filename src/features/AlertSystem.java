package features;

import javax.swing.JOptionPane;
import sources.CommonSources;
import sources.SourceForAlertSystem;
import demonstration.DemoApplication;

/**
 *
 * @author Cheong Mei Poh
 */
public class AlertSystem {
    public static void alertSystem() {
    
        String[] acceptableValues = {"flood", "earthquake", "volcano", "monsoon", "typhoon"};
        String input;
        input = (String)JOptionPane.showInputDialog(null,
                "Which disaster's observation do you want to track?",
                "Information for prevention",
                1,  //changed this
                null,
                acceptableValues,  
                acceptableValues[1]);
        
        if (input.equals(nochoice())){
            CommonSources cm = new CommonSources();
            cm.backOption();
        }
        
        switch(input){
            case "flood":
                SourceForAlertSystem.flood();
                break;

            case "earthquake":
                SourceForAlertSystem.earthquake();
                break;

            case "volcano":
                SourceForAlertSystem.volcano();
                break;

            case "monsoon":
                SourceForAlertSystem.monsoon();
                break;

            case "typhoon":
                SourceForAlertSystem.typhoon();
                break;
        }
    }
    
    private static String nochoice(){
        return null;
    }
}

package features;
import demonstration.DemoApplication;
import javax.swing.JOptionPane;
import sources.CommonSources;
import sources.SourceForEarlyWarning;

/**
 *
 * @author Chang Yu En
 */
public class EarlyWarning {
    public static void earlyWarning(){
        
        String[] acceptableValues = {"Kuala Lumpur", "Manila", "Tokyo", "Bangkok", "Jakarta"};
        String input = (String)JOptionPane.showInputDialog(null,
                "Which place's situation do you want to confirm?",
                "Information for prevention",
                1,  //changed this
                null,
                acceptableValues,
                acceptableValues[1]);  
        
        if (input.equals(nochoice())){
            CommonSources cm = new CommonSources();
            cm.backOption();
            DemoApplication.main(acceptableValues);
        }
        
        switch(input){
            case "Kuala Lumpur":
                SourceForEarlyWarning.flood();
                break;
                
            case "Manila":
                SourceForEarlyWarning.earthquake();
                break;
                
            case "Tokyo":
                SourceForEarlyWarning.typhoon();
                break;
                
            case "Bangkok":
                SourceForEarlyWarning.monsoon();
                break;
                
            case "Jakarta":
                SourceForEarlyWarning.volcano();
                break;
        }   
    }
    
    private static String nochoice(){
        return null;
    }
}

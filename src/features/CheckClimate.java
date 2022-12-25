package features;
import demonstration.DemoApplication;
import javax.swing.JOptionPane;
import sources.CommonSources;
import sources.SourceForCheckClimate;

/**
 * 
 * @author Gan Zuo Qi
 */
public class CheckClimate {
    public static void checkClimate() {
	
        String[] acceptableValues = {"Kuala Lumpur", "Manila", "Tokyo", "Bangkok", "Jakarta"};
        String input = (String)JOptionPane.showInputDialog(null,
                "Please select the location you want to check the climate.",
                "Welcome",
                1,  //changed this
                null,
                acceptableValues,
                acceptableValues[1]);  
        
        if (input.equals(nochoice())){
            CommonSources cm = new CommonSources();
            cm.backOption();
        }

        switch(input){
            case "Kuala Lumpur":
                SourceForCheckClimate.kualalumpur();
                break;
                
            case "Manila":
                SourceForCheckClimate.manila();
                break;
                
            case "Tokyo":
                SourceForCheckClimate.tokyo();
                break;
                
            case "Bangkok":
                SourceForCheckClimate.bangkok();
                break;
                
            case "Jakarta":
                SourceForCheckClimate.jakarta();
                break;
        }   
    }
    
    private static String nochoice(){
        return null;
    }
}

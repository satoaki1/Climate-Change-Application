package features;
import javax.swing.*;
import sources.CommonSources;
import sources.SourceForHowToPrepareFor;
import demonstration.DemoApplication;

/**
 *
 * @author Ishihara Satoaki
 */
public class HowToPrepareFor {
    public static void searchInfo(){
        
        String[] acceptableValues = {"flood", "earthquake", "volcano", "monsoon", "typhoon"};
        String input = (String)JOptionPane.showInputDialog(null,
                "Which disaster do you wt to prevent?",
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
                SourceForHowToPrepareFor.flood();
                break;

            case "earthquake":
                SourceForHowToPrepareFor.earthquake();
                break;

            case "volcano": 
                SourceForHowToPrepareFor.volcano();
                break;

            case "monsoon":
                SourceForHowToPrepareFor.monsoon();
                break;

            case "typhoon": 
                SourceForHowToPrepareFor.typhoon();
                break;
            
        }
    }
    
    private static String nochoice(){
        return null;
    }
}

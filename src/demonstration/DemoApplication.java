package demonstration;
import javax.swing.JOptionPane;
import features.*;
import sources.CommonSources;

/**
 *
 * @author Ishihara satoaki
 */
public class DemoApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] acceptableValues = {"Check the Climate", "Warning", "Alert", "Information to protect yourself", "How to escape"};
        
        while(alwaysrunning()){
            String input = (String)JOptionPane.showInputDialog(null,
                    "Hello. Please choose one from the choices.",
                    "Welcome",
                    1,  //changed this
                    null,
                    acceptableValues,
                    acceptableValues[1]);   

            
            while(input.equals(nochoice())){
                switch(input){
                    case "Check the Climate":
                        CheckClimate.checkClimate();
                        break;

                    case "Warning":
                        EarlyWarning.earlyWarning();
                        break;

                    case "Alert":
                        AlertSystem.alertSystem();
                        break;

                    case "Information to protect yourself":
                        HowToPrepareFor.searchInfo();
                        break;

                    case "How to escape":
                        EscapeRoutes.escaperoutes();
                        break;
                }
            }
            
            CommonSources cs = new CommonSources();
            cs.quitornot();
        }
    }
    
    public static boolean alwaysrunning(){
        return true;
    }
    
    private static String nochoice(){
        return null;
    }
}

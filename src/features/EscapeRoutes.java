package features;
import demonstration.DemoApplication;
import javax.swing.JOptionPane;
import sources.SourceForEscapeRoutes;

/**
 *
 * @author Tomas Wong Hong Wing
 */
public class EscapeRoutes {
    public static void escaperoutes(){
        String[] boo = {"Yes", "no"};
        Integer option = JOptionPane.showOptionDialog(null, "Do you want to check the escape routes?", "", 0, 1, null, boo, boo[0]);
        if (option == 0){
            SourceForEscapeRoutes.escapeRoutes();
            DemoApplication.main(boo);
        } else {
            DemoApplication.main(boo);
        }
    }
}
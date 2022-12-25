package sources;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas Wong Hong Wing
 */
public class SourceForEscapeRoutes {
    public static void escapeRoutes(){
        JOptionPane.showMessageDialog(null, 
                "THIS IS A NEW FILE OF AN EXCERPT SOURCE BY \"https://www.ready.gov/evacuation\"", 
                "Reference", 
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                """
                Many kinds of emergencies can cause you to have to evacuate. \n
                In some cases, you may have a day or two to prepare while other situations might call for an immediate evacuation. \n
                Planning is vital to making sure that you can evacuate quickly and safely no matter what the circumstances.""",
                "Plan to Evacuate",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                """
                Learn the types of disasters that are likely in your community and the local emergency, evacuation and shelter plans for each specific disaster. \n
                Plan how you will leave and where you will go if you are advised to evacuate.\n
                Check with local officials about what shelter spaces are available for this year.\n
                Be prepared to take cleaning items with you like masks, soap, hand sanitizer, disinfecting wipes or general household cleaning supplies to disinfect surfaces.\n
                Identify several places you could go in an emergency such as a friend’s home in another town or a motel. Choose destinations in different directions so that you have options during an emergency.\n
                Be familiar with alternate routes and other means of transportation out of your area.\n
                Always follow the instructions of local officials and remember that your evacuation route may be on foot depending on the type of disaster.\n
                Come up with a family/household plan to stay in touch in case you become separated; have a meeting place and update it depending on the circumstance.\n
                Assemble supplies that are ready for evacuation. Prepare a “go-bag” you can carry when you evacuate on foot or public transportation and supplies for traveling longer distances if you have a car.""",
                "Before an evacuation",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                """
                Keep a full tank of gas if an evacuation seems likely. Keep a half tank of gas in it at all times in case of an unexpected need to evacuate. \n
                Gas stations may be closed during emergencies and unable to pump gas during power outages. Plan to take one car per family to reduce congestion and delay.\n
                Make sure you have a portable emergency kit in the car.\n
                If you do not have a car, plan how you will leave if needed. Decide with family, friends or your local emergency management office to see what resources may be available.""",
                "If you have a car",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                """
                Listen to a battery-powered radio and follow local evacuation instructions.\n
                Take your emergency supply kit.\n
                Leave early enough to avoid being trapped by severe weather.""",
                "During an Evacuation",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                """
                If you evacuated for the storm, check with local officials both where you’re staying and back home before you travel.\n
                If you are returning to disaster-affected areas, after significant events prepare for disruptions to daily activities and remember that returning home before storm debris is cleared is dangerous.\n
                Let friends and family know before you leave and when you arrive.\n
                Charge devices and consider getting back-up batteries in case power-outages continue.\n
                Fill up your gas tank and consider downloading a fuel app to check for outages along your route.\n
                Bring supplies such as water and non-perishable food for the car ride.\n
                Avoid downed power or utility lines, they may be live with deadly voltage. Stay away and report them immediately to your power or utility company.\n
                Only use generators outside and away from your home and NEVER run a generator inside a home or garage or connect it to your home's electrical system.""",
                "After an Evacuation",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

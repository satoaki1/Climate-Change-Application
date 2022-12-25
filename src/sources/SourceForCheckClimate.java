package sources;

import javax.swing.*;

/**
 * 
 * @author Ishihara Satoaki
 */
public class SourceForCheckClimate {
    public static void kualalumpur(){
        JOptionPane.showMessageDialog(null,
              "Kuala Lumpur climate is:\r\n"
            + "Current temperature:32 Celsius.\r\n"
            + "Passing cloudss.\r\n"
            + "Feels Like: 37 Celsius\r\n"
            + "Forecast: 34 / 26 Celsius\r\n"
            + "Wind: 11 km/h  from Northwest",
            "Climate Information",
            JOptionPane.INFORMATION_MESSAGE);
    }

    public static void manila(){
        JOptionPane.showMessageDialog(null,
              "Manila climate is:\r\n"
            + "Current temperature:32 Celsius.\r\n"
            + "Scattered clouds.\r\n"
            + "Feels Like: 38 Celsius\r\n"
            + "Forecast: 33 / 27 Celsius\r\n"
            + "Wind: 17 km/h from West",
            "Climate Information",
            JOptionPane.INFORMATION_MESSAGE);
    }

    public static void tokyo(){
        JOptionPane.showMessageDialog(null,
              "Tokyo climate is:\r\n"
            + "Current temperature:24 Celsius.\r\n"
            + "Broken clouds.\r\n"
            + "Feels Like: 26 Celsius\r\n"
            + "Forecast: 21 / 18 Celsius\r\n"
            + "Wind: 11 km/h from South",
            "Climate Information",
            JOptionPane.INFORMATION_MESSAGE);
    }

    public static void bangkok(){
        JOptionPane.showMessageDialog(null,
              "Bangkok climate is:\r\n"
            + "Current temperature:28 Celsius.\r\n"
            + "Partly sunny.\r\n"
            + "Feels Like: 33 Celsius\r\n"
            + "Forecast: 34 / 27 Celsius\r\n"
            + "Wind: 4 km/h from West",
            "Climate Information",
            JOptionPane.INFORMATION_MESSAGE);
    }

    public static void jakarta(){
        JOptionPane.showMessageDialog(null,
              "Jakarta climate is:\r\n"
            + "Current temperature:26 Celsius.\r\n"
            + "Overcast.\r\n"
            + "Feels Like: 28 Celsius\r\n"
            + "Forecast: 32 / 24 Celsius\r\n"
            + "Wind: No Wind",
            "Climate Information",
            JOptionPane.INFORMATION_MESSAGE);
    }
}

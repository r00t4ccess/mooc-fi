package FlightControl;

import FlightControl.UI.*;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FlightControl flightc = new FlightControl();
        
        
        TextUI ui = new TextUI(flightc, scan);
        ui.start();
    }
}

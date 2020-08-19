
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longname = " ";
        int avgdate = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] person = input.split(",");
            if (person[0].length() > longname.length()) {
                longname = person[0];
            }
            avgdate = avgdate + Integer.valueOf(person[1]);
            count++;
        }
        System.out.println("Longest name: " + longname);
        System.out.println("Average of the birth years: " + ((double) avgdate / count ));
        
        


    }
}

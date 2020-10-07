
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        System.out.println("input numbers, type \"end\" to stop.");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                inputs.add(input);
            }
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        String out = " ";
        double average = 0;
        if (input.equals("n")) {
            average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num <= 0)
                    .average()
                    .getAsDouble();
            out = "negative";
        } else if (input.equals("p")) {
            average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num >= 0)
                    .average()
                    .getAsDouble();
            out = "positive";
        }
        
        System.out.println("Average of the " + out + " numbers: " + average);


    }
}

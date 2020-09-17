
import java.util.Scanner;

public class LiquidContainers {
    
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String task = parts[0];
            if (task.equals("add")) {
                int amount = Integer.valueOf(parts[1]);
                if (amount >=0) {
                first += amount;
                }
                if (first >= 100) {
                    first = 100;
                }
            }
            if (task.equals("move")) {
                int amount = Integer.valueOf(parts[1]);
                if (amount >= 0 && first > 0){
                    if (amount > first) {
                        second = first;
                    } else {
                        second += amount;
                        first -= amount;
                    }
                }
                if (first <= 0) {
                    first = 0;
                }
                if (second >= 100) {
                    second = 100;
                }
            }
            if (task.equals("remove")) {
                int amount = Integer.valueOf(parts[1]);
                if (amount >= 0) {
                    second -= amount;
                }
                if (second <= 0) {
                    second = 0;
                }
            }
        }
    }
}

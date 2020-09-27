
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPos = 0;
        int counter = 0;
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            } else if (value > 0) {
                totalPos = totalPos + value;
                counter = counter + 1;
            }
        }
        if (totalPos ==0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) totalPos / counter );
        }

    }
}


import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int first = scanner.nextInt();
        System.out.println("Second number?");
        int second = scanner.nextInt();
        int total = 0;
        for (int i = first; i <= second; i++) {
            total = total + i;
        }
        System.out.println("The sum is: " + total);

    }
}


import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int value = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= value; i++ ) {
            total = total + i;
        }
        System.out.println("The sum is " + total );

    }
}

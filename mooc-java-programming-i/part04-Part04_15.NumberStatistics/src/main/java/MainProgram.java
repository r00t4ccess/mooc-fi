
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        Statistics total = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        while (true) {
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            } else if (value % 2 == 0 ){
                even.addNumber(value);
            } else {
                odd.addNumber(value);
            }
            total.addNumber(value);
            
        }
        System.out.println("Sum " + total.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of the odd numbers: " + odd.sum());
    }
}

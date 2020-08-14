
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        while (true) {
            int value = scanner.nextInt();
            if ( value == -1){
                break;
            } else if (value % 2 == 0 ) {
                even++;
            } else {
                odd++;
            }
            counter++;
            sum = sum + value;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + ((double) sum / counter));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}

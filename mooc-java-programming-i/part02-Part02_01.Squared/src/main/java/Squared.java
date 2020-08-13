
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give number to square:");
        int sqrval = Integer.valueOf(scanner.nextLine());
        System.out.println(sqrval * sqrval);

    }
}

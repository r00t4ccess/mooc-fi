
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ans = scanner.nextLine();
        if (Boolean.valueOf(ans)) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }


    }
}


import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("end")) {
                break;
            }
            double value = Integer.valueOf(input);
            double cube = Math.pow(value, 3);
            System.out.println((int) cube);
        }

    }
}

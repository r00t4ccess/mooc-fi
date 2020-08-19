
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            } else {
                String[] parts = input.split(" ");
                for (String i : parts) {
                    System.out.println(i);
                }
            }
        }
    }
}

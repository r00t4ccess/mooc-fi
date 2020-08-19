
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] split = input.split(",");
            if (oldest < Integer.valueOf(split[1])) {
                oldest = Integer.valueOf(split[1]);
                name = split[0];
            }
        }
        System.out.println("Name of oldest: " + name);

    }
}

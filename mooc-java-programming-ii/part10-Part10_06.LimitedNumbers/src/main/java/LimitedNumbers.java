
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            if (Integer.valueOf(input) < 0) {
                break;
            } else {
                inputs.add(input);
            }
            
        }
        
        inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(n -> n >= 1 && n <= 5)
                .forEach( n -> System.out.println(n));

    }
}

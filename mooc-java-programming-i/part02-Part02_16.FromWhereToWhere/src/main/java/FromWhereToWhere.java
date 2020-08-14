
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to?");
        int endVal = scanner.nextInt();

        System.out.println("Where from?");
        int startVal = scanner.nextInt();
        
        for (int i = startVal; i <= endVal; i++) {
            System.out.println(i);
        }
    
    }
}

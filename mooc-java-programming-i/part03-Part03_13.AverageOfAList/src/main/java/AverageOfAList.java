
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        while (true) {
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            number.add (value);
        }
        int total = 0;
        for (int num : number) {
            total = total + num;
        }
        System.out.println("Average: " + ((double)total / number.size()));
        
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int min = 9999;
        while (true) {
            int value = scanner.nextInt();
            if (value == 9999) {
                break;
            } else {
                numbers.add(value);
                if (min > value) {
                    min = value;
                }
            }
            System.out.println("Smallest number: " + min);
        }
        int index = 0;
        System.out.println("Smallest number: " + min);
        for (int number : numbers) {
            if (numbers.get(index) == min) {
                System.out.println("Found at index: " + index);
            }
            index++;
        }
        
        
        
        
    }
}

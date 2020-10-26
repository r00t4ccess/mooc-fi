
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

        int[] numbers = {8, 2, 9, 1, 1};
        System.out.println(sum(numbers, 0, numbers.length, 0, 999));
        
    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int start = fromWhere;
        int stop = toWhere;
        int small = smallest;
        int large = largest;
        int total = 0;
        
        if (start < 0) {
            start = 0;
        }
        if (stop > array.length) {
            stop = array.length;
        }
        for (int i = start; i < stop; i++) {
            if (array[i] <= large && array[i] >= small) {
                total += array[i];
            }
        }
        return total;
    }

}

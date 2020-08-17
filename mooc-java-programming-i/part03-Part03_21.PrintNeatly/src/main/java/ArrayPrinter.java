
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int count = 0;
        for (int num : array) {
            System.out.print(num);
            if (count < array.length - 1) {
                System.out.print(",");
            }
            count++;
        }
    }
}

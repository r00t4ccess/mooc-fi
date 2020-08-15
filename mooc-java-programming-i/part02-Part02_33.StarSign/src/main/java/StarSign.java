
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(4, 2);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int height = size;
        for (int i = 1; i <=size; i++) {
            for (int t = 0; t < height; t++) {
                System.out.print("*");
            }
            if (i < size) {
                System.out.println("");
            }
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i ++) {
            for (int t = 0; t < width; t++) {
                System.out.print("*");
            }
            if (i < height) {
                System.out.println("");
            }
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int t = 0; t < i; t++) {
                System.out.print("*");
            }
            if (i < size) {
                System.out.println("");
            }
            
        }
    }
}

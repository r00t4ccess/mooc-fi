
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        
        String strval = scan.nextLine();
        
        System.out.println("Give an integer:");
        
        int intval = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        
        double doubval = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        
        boolean boolval = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + strval);
        System.out.println("You gave the integer " + intval);
        System.out.println("You gave the double " + doubval);
        System.out.println("You gave the boolean " + boolval);

    }
}

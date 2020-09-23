
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Points points = new Points();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            } 
            points.add(input);
                
        }
        
        points.average();
        points.avgPassing();
        points.passPercentage();
        points.gradeDistribution();
        

    }
}

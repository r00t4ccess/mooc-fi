
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            ArrayList<Teams> teams = new ArrayList<>();
            while (reader.hasNextLine()) {
                
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}

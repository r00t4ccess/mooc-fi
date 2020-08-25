
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                if (reader.nextLine().contains(searchedFor)) {
                    result = "Found!";
                    break;
                } else {
                    result = "Not found.";
                }
            }
            System.out.println(result);
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " has failed.");
        }
        

    }
}

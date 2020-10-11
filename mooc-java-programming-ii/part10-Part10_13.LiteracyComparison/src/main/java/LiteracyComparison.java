
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(n -> n.split(","))
                    .sorted((c, g) -> c[5].compareTo(g[5]))
                    .map(p -> p[3] +" (" + p[4] + "), " + p[2].split(" ")[1].trim() + ", " + p[5])
                    .forEach(n -> System.out.println(n));
            
        } catch (Exception e) {
            System.out.println("Cound not read file " + e.getMessage());
        }
            
    }
}

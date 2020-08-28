
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        //team = team.toUpperCase();
        int wins = 0;
        int losses = 0;
        int gamesPlayed = 0;
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            ArrayList<String> games = new ArrayList<>();
            while (reader.hasNextLine()) {
                games.add(reader.nextLine());
            }
            for (String i : games) {
                String[] parts = i.split(",");
                if (parts[0].equals(team) || parts[1].equals(team)) {
                    gamesPlayed++;
                    if (parts[0].equals(team) && Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        wins++;
                    } else if (parts[1].equals(team) && Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + gamesPlayed);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}

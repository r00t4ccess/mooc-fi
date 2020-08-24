import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Duration:");
            int duration = Integer.valueOf(scanner.nextLine());
            TelevisionProgram program = new TelevisionProgram(name, duration);
            programs.add(program);
        }
        System.out.println("Programs maximum duration?");
        int maxdur = scanner.nextInt();
        for (TelevisionProgram i : programs) {
            if (i.getDuration() <= maxdur) {
                System.out.println(i.getName() + ", " + i.getDuration() + " minutes");
            }
        }

    }
}

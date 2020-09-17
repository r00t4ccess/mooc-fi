
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container cont1 = new Container();
        Container cont2 = new Container();
        while (true) {

            System.out.println("First: " + cont1.contains() + "/100");
            System.out.println("Second: " + cont2.contains() + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String task = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (task.equals("add")) {
                cont1.add(amount);
            }
            if (task.equals("move")) {
                cont1.remove(amount);
                cont2.add(amount);
            }
            if (task.equals("remove")) {
                cont2.remove(amount);
            }
        }
    }

}

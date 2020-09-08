
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String ident = scanner.nextLine();
            if (ident.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }

            Item thing = new Item(ident, name);

            if (!(itemList.contains(thing))) {
                itemList.add(thing);
            }
        }
        System.out.println("==Items==");
        for (Item i : itemList) {
            System.out.println(i);
        }
    }
}

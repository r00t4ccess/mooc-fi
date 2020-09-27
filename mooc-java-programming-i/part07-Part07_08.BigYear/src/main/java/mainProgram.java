
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdList birds = new BirdList();
        while (true) {
            System.out.println("?");
            String input = scan.nextLine();
            input = input.toLowerCase();
        
            if (input.equals("add")){
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in latin: ");
                String nameLatin = scan.nextLine();
                birds.addBird(name, nameLatin);
            } else if (input.equals("observation")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                birds.observeBird(bird);
            } else if (input.equals("all")) {
                birds.listAll();
            } else if (input.equals("one")) {
                System.out.println("Bird? ");
                String bird = scan.nextLine();
                birds.oneBird(bird);
            } else if ( input.equals("quit")) {
                break;
            }
        }

    }

}

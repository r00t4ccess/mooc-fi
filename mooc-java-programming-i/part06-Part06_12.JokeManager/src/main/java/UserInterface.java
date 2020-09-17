/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeMan;
    private Scanner scan;
    
    
    public UserInterface(JokeManager jokes, Scanner scan ) {
        this.jokeMan = jokes;
        this.scan = scan;
    }
    
    public void start() {
        String input;
        while (true) {
            System.out.println("Commands: \n 1 - add a joke \n 2 - draw a joke \n 3 - list jokes \n X -stop");
            input = this.scan.nextLine();
            if (input.equals("X")) {
                break;
            } else if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                String newJoke = this.scan.nextLine();
                this.jokeMan.addJoke(newJoke);
            } else if (input.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.jokeMan.drawJoke());
            } else if (input.equals("3")) {
                System.out.println("Printing Jokes");
                this.jokeMan.printJokes();
            }
        }
    }
    
}

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

public class TextUI {
    private Scanner scan;
    private SimpleDictionary dict;
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scan = scanner;
        this.dict = dictionary;
    }
    
    public void start() {
        String input = "";
        while (true) {
            System.out.println("Command");
            input = this.scan.nextLine();
            if (input.equals("add")){
                System.out.println("Word:");
                String word = this.scan.nextLine();
                System.out.println("Translation");
                String translation = this.scan.nextLine();
                this.dict.add(word, translation);
            } else if (input.equals("search")) {
                System.out.println("To be translated");
                String searchTerm = this.scan.nextLine();
                if (dict.translate(searchTerm) == null) {
                    System.out.println("Word " + searchTerm + " was not found");
                } else {
                    System.out.println(dict.translate(searchTerm));
                }
            } else if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else {
                System.out.println("Command unknown");
            }
            
        }
        
    }
    
}

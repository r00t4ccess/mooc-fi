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
    private Scanner scan;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.scan = scan;
        this.list = list;
    }
    
    public void start() {
        while (true) {
            String input = this.scan.nextLine();
            if (input.equals("add")){
                System.out.println("To add:");
                String addLine = scan.nextLine();
                this.list.add(addLine);
            } else if (input.equals("list")) {
                this.list.print();
            } else if (input.equals("remove")) {
                System.out.println("Which one is removed");
                int rem = scan.nextInt();
                this.list.remove(rem);
            } else if (input.equals("stop")) {
                break;
            }
        }
    }
}

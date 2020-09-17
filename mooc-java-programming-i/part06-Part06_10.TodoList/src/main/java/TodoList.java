/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    public TodoList(){
        this.list = new ArrayList<>();
    }
    
    public void add (String task) {
        list.add(task);
    }
    
    public void print() {
        for (String i : list) {
            System.out.println((list.indexOf(i) +1) + ": " + i);
        }
    }
    
    public void remove(int number) {
        list.remove(number - 1);
    }
    
}

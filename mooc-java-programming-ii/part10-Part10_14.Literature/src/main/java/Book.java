/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */


public class Book {
    
    private String title;
    private int age;
    
    public Book(String title, int age) {
        this.age = age;
        this.title = title;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String toString() {
        return this.getTitle() + " (recommended for " + this.getAge() + " year-olds or older)";
    }

}

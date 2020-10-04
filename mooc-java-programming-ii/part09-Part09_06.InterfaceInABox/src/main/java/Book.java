/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */
public class Book implements Packable {
    
    private String author;
    private double weight;
    private String title;
    
    public Book(String author, String title, double weight) {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }
    
    public double weight() {
        return this.weight;
    }
    
    public String toString() {
        return this.author + ": " + this.title;
    }
    
}

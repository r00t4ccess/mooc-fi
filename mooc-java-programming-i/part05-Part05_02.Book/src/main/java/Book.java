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
    private String author;
    private String title;
    private int pages;
    
    public Book(String tempAuthor, String tempTitle, int tempPages) {
        this.author = tempAuthor;
        this.title = tempTitle;
        this.pages = tempPages;
    }
    
    public String toString() {
        return this.author + ", " + this.title + ", " + this.pages + " pages";
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getName() {
        return this.title;
    }
}

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
    private int pubYear;
    private int pages;
    
    public Book (String tempTitle, int tempPages, int tempPubYear) {
        this.title = tempTitle;
        this.pages = tempPages;
        this.pubYear = tempPubYear;
    }
    
    public void title () {
        System.out.println(this.title);
    }
    public void info () {
        System.out.println(this.title + ", " + this.pages + " pages, " + this.pubYear);
    }
}

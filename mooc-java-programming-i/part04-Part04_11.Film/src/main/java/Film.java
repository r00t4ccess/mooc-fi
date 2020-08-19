/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */
public class Film {
    private String filmName;
    private int rating;
    
    public Film(String name, int ageRating) {
       filmName = name;
       rating = ageRating;
    }
    public String name() {
        return this.filmName;
    }
    
    public int ageRating() {
        return this.rating;
    }
}

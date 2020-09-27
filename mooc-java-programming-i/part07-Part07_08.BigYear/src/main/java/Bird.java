/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */
public class Bird {
    private int birdObservations;
    private String birdName;
    private String birdNameLatin;
    
    public Bird(String name, String nameLatin) {
        this.birdName = name;
        this.birdNameLatin = nameLatin;
        this.birdObservations = 0;
    }
    
    public void observe() {
        this.birdObservations++;
    }
    
    public String toString() {
        return this.birdName + " (" + this.birdNameLatin + "): " + this.birdObservations + " observations";
    }
    
    public String getName() {
        return this.birdName;
    }
}

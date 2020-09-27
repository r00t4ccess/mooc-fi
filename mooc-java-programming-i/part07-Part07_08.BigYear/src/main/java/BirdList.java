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


public class BirdList {
    private ArrayList<Bird> birdList;
    
    public BirdList() {
        birdList = new ArrayList<>();
    }
    
    public void addBird(String name, String nameLatin) {
        Bird bird = new Bird(name, nameLatin);
        birdList.add(bird);
    }
    
    public void listAll() {
        for (Bird i : birdList) {
            System.out.println(i.toString());
        }
    }
    
    public void oneBird(String bird) {
        boolean isBird = false;
        for (Bird i : birdList) {
            if (i.getName().equals(bird)) {
                System.out.println(i.toString());
                isBird = true;
            }
        }
        if (isBird == false) {
            System.out.println("Not a bird!");
        }
    }
    
    public void observeBird(String bird) {
        boolean isBird = false;
        for (Bird i : birdList) {
            if (i.getName().equals(bird)) {
                i.observe();
                isBird = true;
            }
        }
        if (isBird == false) {
            System.out.println("Not a bird!");
        }
        
    }
}

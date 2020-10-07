/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */

import java.util.*;

public class Herd implements Movable{
    
    private ArrayList<Movable> herd;
    
    public Herd() {
        herd = new ArrayList<>();
    }
    
    public String toString() {
        String herdMembers = " ";
        for (Movable i: herd) {
            herdMembers += i.toString() + "\n";
        }
        
        return herdMembers;
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable i : herd) {
            i.move(dx, dy);
        }
    }
    
    
    
}

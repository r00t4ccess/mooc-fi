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

public class Box implements Packable{
    private ArrayList<Packable> box;
    private double capacity;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }
    
    public void add(Packable item) {
        
        if (item.weight() + this.weight() <= this.capacity ) {
            box.add(item);
        }
    }
    
    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable i : box) {
            totalWeight += i.weight() ;
        }
        return totalWeight;
    }
    
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }
    
}

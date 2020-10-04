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

public class BoxWithMaxWeight extends Box {
    
    private int maxWeight = 0;
    private ArrayList<Item> boxes;
    
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        boxes = new ArrayList<>();

    }
    
    @Override
    public void add(Item item) {
        int totalWeight = 0;
        for (Item i : boxes) {
            totalWeight += i.getWeight();
        }
        if (item.getWeight() + totalWeight <= this.maxWeight) {
            boxes.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        if (boxes.contains(item)) {
            return true;
        }
        
        return false;
    }
    
}

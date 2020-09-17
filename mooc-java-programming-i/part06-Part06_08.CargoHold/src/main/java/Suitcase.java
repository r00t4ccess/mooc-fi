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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> contents;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (!(totalWeight() + item.getWeight() > maxWeight)) {
            this.contents.add(item);
        }        
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Item i : this.contents) {
            weight += i.getWeight();
        }
        return weight;
    }
    
    public String toString() {
        String output ="";
        if (this.contents.isEmpty()) {
            output = "no items (";
        } else if (this.contents.size() == 1) {
            output = this.contents.size() + " item (";
        } else {
            output = this.contents.size() + " items (";
        }
        
        return output + totalWeight() + " kg)";
    }
    
    public void printItems() {
        String itemNames= "";
        for (Item i : this.contents) {
            itemNames += i.getName() + " (" + i.getWeight() + " kg) \n";
        }
        System.out.println(itemNames);
    }
    
    public Item heaviestItem() {
        if (this.contents.isEmpty()) {
            return null;
        }
        Item heaviest = this.contents.get(0);
        for (Item i : this.contents) {
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }
        }
        return heaviest;
    }
    
}

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

public class Hold {
    private ArrayList<Suitcase> holdCases;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holdCases = new ArrayList<>();
    }
    
    public int totalHoldWeight() {
        int totalWeight = 0;
        for (Suitcase i : this.holdCases) {
            totalWeight += i.totalWeight();
        }
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (!(totalHoldWeight() + suitcase.totalWeight() > this.maxWeight )) {
            holdCases.add(suitcase);
        }
        
    }
    
    public String toString() {
        String output = "";
        if (this.holdCases.size() == 0) {
            output = "No suitcases (";
        } else {
            output = this.holdCases.size() + "suitcases (";
        }
        return output + totalHoldWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase i : this.holdCases) {
            i.printItems();
        }
    }
}

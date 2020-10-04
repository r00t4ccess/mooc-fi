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


public class ChangeHistory {
    
    private ArrayList<Double> changes;
    
    public ChangeHistory() {
        changes = new ArrayList<>();
    }
    
    public void add(double status) {
        changes.add(status);
    }
    
    public void clear() {
        changes.clear();
    }
    
    public String toString() {
        return changes.toString();
    }
    
    public double maxValue() {
        double largest = changes.get(0);
        for (double i : changes) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }
    
    public double minValue() {
        double smallest = changes.get(0);
        for (double i : changes) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }
    
    public double average() {
        double total = 0.0;
        for (double i : changes) {
            total += i;
        }
        return total / changes.size();
    }
}

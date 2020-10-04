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

public class OneItemBox extends Box {
    
    private ArrayList<Item> box;
    
    public OneItemBox() {
        box = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if (box.isEmpty()) {
            box.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        if (box.contains(item)) {
            return true;
        }
        return false;
    }
    
    
}

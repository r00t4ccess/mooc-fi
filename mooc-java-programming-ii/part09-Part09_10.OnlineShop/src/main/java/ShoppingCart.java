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

public class ShoppingCart {
    
    private Map<String, Item> cart;
    
    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
        } else {
            this.cart.put(product, new Item(product, 1, price));
        }
    }
    
    public int price() {
        int total = 0;
        Collection<Item> keys = cart.values();
        for (Item i : keys) {
            total += i.price();
        }
        return total;
    }
    
    public void print() {
        Collection<Item> values = cart.values();
        for (Item i : values) {
            System.out.println(i.toString());
        }
    }
}

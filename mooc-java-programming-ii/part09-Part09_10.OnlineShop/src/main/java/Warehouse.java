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

public class Warehouse {
    
    private Map<String, Integer> warehouse;
    private Map<String, Integer> stock;
    
    public Warehouse() {
        this.warehouse = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.warehouse.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product) {
        Collection<String> keys = this.warehouse.keySet();
        if (keys.contains(product)) {
            return this.warehouse.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        Collection<String> keys = this.stock.keySet();
        if (keys.contains(product)) {
            return this.stock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product) {
        if (this.stock(product) -1 >= 0) {
            this.stock.put(product, this.stock.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> products = this.warehouse.keySet();
        return products;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */
public class Product {
        private String name = "";
        private double price = 0;
        private int quantity = 0; 
    public Product(String initialName, double initialPrice, int initialQuantity) {
        name = initialName;
        price = initialPrice;
        quantity = initialQuantity;
        
    }
    public void printProduct() {
        System.out.println(this.name + "," + this.price + "," + this.quantity);
    }
    
}

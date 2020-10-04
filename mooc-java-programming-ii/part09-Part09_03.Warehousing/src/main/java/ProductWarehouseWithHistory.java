/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changes;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super (productName, capacity);
        this.changes = new ChangeHistory();
        this.changes.add(initialBalance);
        super.addToWarehouse(initialBalance);

    }
    
    public String history() {
        return this.changes.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        double result = 0;
        result = super.getBalance() + amount;
        this.changes.add(result);
        super.addToWarehouse(amount);
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double result = 0;
        result = super.getBalance() - amount;
        this.changes.add(result);
        return super.takeFromWarehouse(amount);
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\n" +
                "History: "+ this.history() + "\n" +
                "Largest amount of product: " + this.changes.maxValue() + "\n" +
                "Smallest amount of product: " + this.changes.minValue() + "\n" +  
                "Average: " + this.changes.average());
    }
}

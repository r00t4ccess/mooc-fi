/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */

import java.util.HashMap;

public class IOU {
    
    private HashMap<String, Double> debt;
    
    public IOU() {
        debt = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        debt.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if (debt.containsKey(toWhom)){
            return debt.get(toWhom);
        }
        return 0;
    }
}

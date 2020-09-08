/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */
public class Item {
    
    private String name;
    private String ident;
    
    public Item(String tempIdent, String tempName) {
        this.name = tempName;
        this.ident = tempIdent;
    }
    
    public String toString() {
        return this.ident + ": " + this.name;
    }
    
    public boolean equals(Object compared) {
        Item input = (Item) compared;
        return this.ident.equals(input.ident);

    }
    
}

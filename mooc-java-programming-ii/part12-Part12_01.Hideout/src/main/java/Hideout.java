/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */

public class Hideout<T> {
    
    private T hideOut;
    
    public Hideout() {
        this.hideOut = null;
    }
    
    public void putIntoHideout(T toHide) {
        this.hideOut = toHide;
    }
    
    public T takeFromHideout() {
        T value = this.hideOut;
        this.hideOut = null;
        return value;
    }
    
    public boolean isInHideout() {
        return this.hideOut != null;
    }
    
}

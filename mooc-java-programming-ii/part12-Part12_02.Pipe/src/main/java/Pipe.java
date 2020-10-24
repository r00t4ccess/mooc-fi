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

public class Pipe<T> {
    
    private ArrayList<T> pipes;
    
    public Pipe() {
        this.pipes = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipes.add(value);
    }
    
    
    public T takeFromPipe() {
        T remValue = null;
        if (!this.pipes.isEmpty()) {
            remValue = this.pipes.get(0);
            this.pipes.remove(this.pipes.get(0));
        }
        return remValue;
    }
    
    public boolean isInPipe() {
        return !this.pipes.isEmpty();        
    }
    
}

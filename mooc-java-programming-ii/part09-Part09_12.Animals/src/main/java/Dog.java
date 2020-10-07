/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */
public class Dog extends Animal implements NoiseCapable {
    
    public Dog(String name) {
        super(name);
    }
    
    public Dog() {
        super("Dog");
    }
    
    public void bark() {
        this.makeNoise();
    }
    
    @Override
    public void makeNoise() {
        System.out.println(super.getName() + " barks");
    }
    
    
}

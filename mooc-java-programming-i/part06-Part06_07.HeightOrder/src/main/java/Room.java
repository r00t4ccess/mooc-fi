/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charbol
 */

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> members = new ArrayList<>();
    
    public Room() {
        
    }
    
    public void add(Person person) {
        this.members.add(person);
    }
    
    public boolean isEmpty() {
        return this.members.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        
        return this.members;
    }
    
    public Person shortest() {
        if(this.members.isEmpty()) {
            return null;
        }
        Person shortest = this.members.get(0);
        for (Person i : this.members) {
            if (shortest.getHeight() > i.getHeight()) {
                shortest = i;
            }
        }
        return shortest ;
    }
    
    public Person take() {
        if (this.members.isEmpty()) {
            return null;
        }
        Person shortest = shortest();
        this.members.remove(shortest);
        return shortest;
    }
    
}

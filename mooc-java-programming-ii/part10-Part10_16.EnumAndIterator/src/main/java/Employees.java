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


public class Employees {
    
    private ArrayList<Person> employees;
    
    public Employees() {
        employees = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.employees.add(person);
    }
    
    public void add(List<Person> peopleToAdd) {
        for (Person i: peopleToAdd) {
            this.employees.add(i);
        }
    }
    
    public void print() {
        Iterator<Person> people = employees.iterator();
        
        while (people.hasNext()) {
            Person person = people.next();
            System.out.println(person.toString());
        }
    }
    
    public void print(Education education) {
        
        Iterator<Person> people = employees.iterator();
        
        while (people.hasNext()) {
            Person person = people.next();
            if (person.getEducation() == education) {
                System.out.println(person.toString());
            }

        }

    }
    
    public void fire(Education education) {
        Iterator<Person> fire = employees.iterator();
        
        while (fire.hasNext()) {
            if (fire.next().getEducation() == education) {
                fire.remove();
            }
        }
    }
    
    
}

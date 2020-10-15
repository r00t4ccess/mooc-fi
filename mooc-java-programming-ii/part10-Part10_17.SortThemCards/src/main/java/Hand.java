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

public class Hand implements Comparable<Hand> {
    
    private List<Card> hand;
    
    public Hand() {
        hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        hand.add(card);
    }
    
    public void print() {
        hand.stream()
                .forEach(n -> System.out.println(n.toString()));
    }
    
    public void sort() {
        Collections.sort(this.hand);
    }
    
    @Override
    public int compareTo(Hand hand) {
            return this.handTotal() - hand.handTotal();
  
    }
    
    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
    public int handTotal() {
        return hand.stream().mapToInt(Card::getValue).sum();
    }
    
    
    
    
}

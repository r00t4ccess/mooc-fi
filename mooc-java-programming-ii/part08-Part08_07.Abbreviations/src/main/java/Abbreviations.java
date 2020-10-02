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

public class Abbreviations {
    private HashMap<String , String> abbreviationList;
    
    public Abbreviations() {
        abbreviationList = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationList.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return abbreviationList.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        return abbreviationList.get(abbreviation);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author larry
 */

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.List;
import java.util.Collections;

public class SaveableDictionary {
    private Map<String, String> words;
    private String file;
    
    public SaveableDictionary() {
        this.words = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    
    public boolean load() {
        try {
            Scanner scan = new Scanner(Paths.get(this.file));
            while (scan.hasNextLine()) {
                String input = scan.nextLine();
                String[] part = input.split(":");
                this.add(part[0], part[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
            return false;
        }
            
    }
    
    public void add(String words, String translation) {
        this.words.putIfAbsent(words, translation);
    }
    
    public String translate(String word) {
        String translate = null;
        
        if (words.containsKey(word)) {
            translate = words.get(word);
        } else if (words.containsValue(word)) {
            for (Map.Entry entry : words.entrySet()){
                if (word.equals(entry.getValue())) {
                    translate = entry.getKey().toString();
                    
                }
            }
        }

        return translate;
    }
    
    public void delete(String word) {
        if (this.words.remove(word) == null) {
            this.words.values().removeIf(x -> x.contains(word));
        }
    }
    
    public boolean save() {
        try {
            List<String> savedWords = new ArrayList<>();
            PrintWriter printer = new PrintWriter(file);
            this.words.keySet().stream().forEach(value -> {
                if (savedWords.contains(value)) {
                }
                printer.println(value + ":" + this.words.get(value));
                savedWords.add(value);
                savedWords.add(words.get(value));
            });
            printer.close();
            return true;           
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }
    
}

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

public class Points {
    private ArrayList<Integer> points;
    
    public Points() {
        this.points = new ArrayList<>();
    }
    
    public void add(int input) {
        if (input >= 0 && input <= 100){
            points.add(input);
        }
    }
    
    public void average() {
        int total = 0;
        for (int i : points) {
            total += i;
        }
        double average = (double) total / points.size();
        
        System.out.println("Point average (all): " + average);
    }
    
    public void avgPassing() {
        int total = 0;
        int counter = 0;
        String output = "-";
        for (int i : points) {
            if (i >= 50) {
                total += i;
                counter ++;
            }
        }
        if (counter > 0) {
            double average = (double) total / counter;
            output = String.valueOf(average);
        }
        
        System.out.println("Point average (passing): " + output);
    }
    
    public void passPercentage() {
        int counter = 0;
        String output = "-";
        for (int i : points) {
            if (i >= 50) {
                counter ++;
            }
        }
        if (counter > 0) {
            double percentage = 100 * ((double) counter / points.size());
            output = String.valueOf(percentage);
        }
        
        System.out.println("Pass percentage: " + output);
    }
    
    public void gradeDistribution() {
        String gradeZero = " ";
        String gradeOne = " ";
        String gradeTwo = " ";
        String gradeThree = " ";
        String gradeFour = " ";
        String gradeFive = " ";
        

        for (int i : points) {
            if (i < 50) {
                gradeZero += "*";
            } else if (i >= 50 && i < 60) {
                gradeOne += "*";
            } else if (i >= 60 && i < 70) {
                gradeTwo += "*";
            } else if (i >= 70 && i < 80) {
                gradeThree += "*";
            } else if (i >= 80 && i < 90) {
                gradeFour += "*";
            } else if (i >= 90) {
                gradeFive += "*";
            }
        }
        System.out.println("Grade distribution:");
        System.out.println("5:" + gradeFive);
        System.out.println("4:" + gradeFour);
        System.out.println("3:" + gradeThree);
        System.out.println("2:" + gradeTwo);
        System.out.println("1:" + gradeOne);
        System.out.println("0:" + gradeZero);
    }
}

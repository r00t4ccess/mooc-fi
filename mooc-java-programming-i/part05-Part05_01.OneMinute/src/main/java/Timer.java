/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charbol
 */
public class Timer {
    private int seconds;
    private int hundredSeconds;
    public Timer() {
        this.seconds = 0;
        this.hundredSeconds = 0;
    }
    public void advance() {
        if (this.hundredSeconds >= 99) {
            this.seconds++;
            this.hundredSeconds = 0;
        
        } else {
            this.hundredSeconds++;
        }
        if (this.seconds >= 60) {
            this.seconds = 0;
        }
    }
    public String toString() {
        return String.format("%02d", this.seconds) + ":" + String.format("%02d", this.hundredSeconds);
    }
}

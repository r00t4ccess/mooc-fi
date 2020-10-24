/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author larry
 */

import java.util.Random;

public class TemperatureSensor implements Sensor{
    
    private boolean sensorState;
    
    public TemperatureSensor() {
        this.sensorState = false;
    }
    @Override
    public boolean isOn() {
        return this.sensorState;
    }
    @Override
    public void setOff() {
        this.sensorState = false;
    }
    @Override
    public void setOn() {
        this.sensorState = true;
    }
    @Override
    public int read() {

        if (this.isOn()) {
            int min = -30;
            int max = 30;
            int sensorValue = new Random().nextInt((max - min) + 1) + min;
            return sensorValue;
        } else {
            throw new IllegalStateException("Sensor is off");
        }
        
    }
    
}

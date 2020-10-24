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

import java.util.stream.Collector;
import java.util.ArrayList;
import java.util.List;


public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> sensorReading;

    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.sensorReading = new ArrayList<>();

    }
    @Override
    public boolean isOn() {
        for (Sensor i : this.sensors) {
            if (!i.isOn()) {
                return false;
            }
        }
        return true;
    }
    @Override
    public void setOn() {
        for (Sensor i : sensors) {
            i.setOn();
        }

    }
    @Override
    public void setOff() {
        for (Sensor i : sensors) {
            i.setOff();
        }
    }
    @Override
    public int read() {
        
        if (this.sensors.isEmpty() || !this.isOn() ) {
            throw new IllegalStateException("No sensors or sensors are off");
        }
        int reading = (int)this.sensors.stream().mapToInt(n -> n.read()).average().getAsDouble();
        this.sensorReading.add(reading);
        return reading;
                
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.sensorReading;
    }
    
}

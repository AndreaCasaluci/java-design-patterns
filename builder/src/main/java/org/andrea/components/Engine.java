package org.andrea.components;

import lombok.extern.slf4j.Slf4j;

/**
 * Just another feature of a car
 */
@Slf4j
public class Engine {

    private double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if(started) {
            this.mileage += mileage;
        } else {
            log.error("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}

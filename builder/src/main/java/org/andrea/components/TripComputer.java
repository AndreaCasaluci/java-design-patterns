package org.andrea.components;

import lombok.extern.slf4j.Slf4j;
import org.andrea.cars.Car;

/**
 * Just another feature of a car
 */
@Slf4j
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
       log.info("Fuel level: "+car.getFuel());
    }

    public void showStatus() {
        if(this.car.getEngine().isStarted()) {
            log.info("Car is started");
        } else {
            log.info("Car isn't started");
        }
    }
}

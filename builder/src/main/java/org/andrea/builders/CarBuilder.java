package org.andrea.builders;

import org.andrea.cars.Car;
import org.andrea.cars.CarType;
import org.andrea.components.Engine;
import org.andrea.components.GPSNavigator;
import org.andrea.components.Transmission;
import org.andrea.components.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {

    }

    @Override
    public void setEnginge(Engine engine) {

    }

    @Override
    public void setTransmission(Transmission transmission) {

    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {

    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {

    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}

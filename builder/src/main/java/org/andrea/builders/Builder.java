package org.andrea.builders;

import org.andrea.cars.CarType;
import org.andrea.components.Engine;
import org.andrea.components.GPSNavigator;
import org.andrea.components.Transmission;
import org.andrea.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a produce.
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEnginge(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

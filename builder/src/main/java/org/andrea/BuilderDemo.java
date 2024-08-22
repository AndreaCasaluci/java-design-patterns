package org.andrea;

import lombok.extern.slf4j.Slf4j;
import org.andrea.builders.CarBuilder;
import org.andrea.builders.ManualBuilder;
import org.andrea.cars.Car;
import org.andrea.cars.Manual;
import org.andrea.director.Director;

/**
 * Demo class. Everything comes together here.
 */
@Slf4j
public class BuilderDemo {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        log.info("Car built:\n{}", car.getCarType());

        ManualBuilder manualBuilder = new ManualBuilder();

        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        log.info("\nCar manual built:\n{}", carManual.print());

    }
}
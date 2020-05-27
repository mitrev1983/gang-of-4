package creational.factory.abstrac;

import java.util.Date;

public interface AbstractVehicleFactory {
    Car createCar(String engineType, Date productionDate, Car.CarType carType);
    Truck createTruck(String engineType, Date productionDate);
}

package creational.factory.abstrac;

import java.util.Date;

public class VehicleFactory implements AbstractVehicleFactory {

    @Override
    public Car createCar(String engineType, Date productionDate, Car.CarType carType) {
        if (carType.equals(Car.CarType.Audi)) {
            return new Audi(engineType, productionDate);
        } else {
            return new Mercedes(engineType, productionDate);
        }
    }

    @Override
    public Truck createTruck(String engineType, Date productionDate) {
        return new Truck(engineType, productionDate);
    }
}

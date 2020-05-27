package creational.factory.abstrac;

import java.util.Date;

public class CarProducerTest {
    private AbstractVehicleFactory abstractCarFactory;

    public CarProducerTest(AbstractVehicleFactory abstractCarFactory) {
        this.abstractCarFactory = abstractCarFactory;
    }

    private Car newCar(String engineType, Date productionDate, Car.CarType carType) {
        return abstractCarFactory.createCar(engineType, productionDate, carType);
    }

    public Truck newTruck(String engineType, Date productionDate) {
        return abstractCarFactory.createTruck(engineType, productionDate);
    }

    public static void main(String[] args) {
        CarProducerTest test = new CarProducerTest(new VehicleFactory());
        Car car1 = test.newCar("Diesel", new Date(), Car.CarType.Audi);
        System.out.println("Car:" + car1);

        Truck truck = test.newTruck("Diesel", new Date());
        System.out.println("Truck:" + truck);
    }


}

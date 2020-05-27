package creational.factory.abstrac;

import java.util.Date;

public class CarProducerTest {
    private AbstractCarFactory abstractCarFactory;

    public CarProducerTest(AbstractCarFactory abstractCarFactory) {
        this.abstractCarFactory = abstractCarFactory;
    }

    private Car newCar(String diesel, Date productionDate) {
        return abstractCarFactory.create(diesel, productionDate);
    }

    public static void main(String[] args) {
        CarProducerTest test1 = new CarProducerTest(new AudiCarFactory());
        Car car1 = test1.newCar("Diesel", new Date());
        System.out.println("Car 1:" + car1);

        CarProducerTest test2 = new CarProducerTest(new MercedesCarFactory());
        Car car2 = test2.newCar("Petrol", new Date());
        System.out.println("Car 2:" + car2);
    }


}

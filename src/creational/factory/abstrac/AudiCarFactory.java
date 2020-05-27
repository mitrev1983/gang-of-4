package creational.factory.abstrac;

import java.util.Date;

public class AudiCarFactory implements AbstractCarFactory {

    @Override
    public Car create(String engineType, Date productionDate) {
        return new Audi(engineType, productionDate);
    }
}

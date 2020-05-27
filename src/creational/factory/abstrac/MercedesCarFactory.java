package creational.factory.abstrac;

import java.util.Date;

public class MercedesCarFactory implements AbstractCarFactory {
    @Override
    public Car create(String engineType, Date productionDate) {
        return new Mercedes(engineType, productionDate);
    }
}

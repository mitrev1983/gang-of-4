package creational.factory.abstrac;

import java.util.Date;

public interface AbstractCarFactory {
    Car create(String engineType, Date productionDate);
}

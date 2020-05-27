package creational.factory.abstrac;

import java.util.Date;

public class Car {
    String engineType;
    Date productionDate;

    public Car(String engineType, Date productionDate) {
        this.engineType = engineType;
        this.productionDate = productionDate;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }
}

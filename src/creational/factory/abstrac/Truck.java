package creational.factory.abstrac;

import java.util.Date;

public class Truck {
    private String name;
    private String engineType;
    Date productionDate;

    public Truck(String engineType, Date productionDate) {
        this.engineType = engineType;
        this.productionDate = productionDate;
        this.name = "Truck Volvo";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + name + '\'' +
                ", engineType='" + engineType + '\'' +
                ", productionDate=" + productionDate +
                "} ";
    }
}

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

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + name + '\'' +
                ", engineType='" + engineType + '\'' +
                ", productionDate=" + productionDate +
                "} ";
    }
}

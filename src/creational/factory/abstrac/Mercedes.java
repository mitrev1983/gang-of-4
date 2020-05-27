package creational.factory.abstrac;

import java.util.Date;

public class Mercedes extends Car {

    private String name;

    public Mercedes(String engineType, Date productionDate) {
        super(engineType, productionDate);
        this.name = "Mercedes";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "model='" + name + '\'' +
                ", engineType='" + engineType + '\'' +
                ", productionDate=" + productionDate +
                "} " + super.toString();
    }
}


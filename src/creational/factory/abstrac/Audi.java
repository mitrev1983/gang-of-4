package creational.factory.abstrac;

import java.util.Date;

public class Audi extends Car {

    private String name;

    public Audi(String engineType, Date productionDate) {
        super(engineType, productionDate);
        this.name = "Audi";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "model='" + name + '\'' +
                ", engineType='" + engineType + '\'' +
                ", productionDate=" + productionDate +
                "} " + super.toString();
    }
}

package Cars.vehicles;

import Cars.details.Engine;
import Cars.professions.Driver;

public class Lorry extends Car{

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    private int carrying;

    public Lorry(String mark, String carClasses, double weight, Driver driver, Engine motor, int carrying) {
        super(mark, carClasses, weight, driver, motor);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Грузовик:\n"+
                "Марка '" + getMark() + '\'' +
                ", класс автомобиля '" + getCarClasses() + '\'' +
                ", вес " + getWeight() +
                ", водитель " + getDriver() +
                ", двигатель: " + getMotor() +
                ", грузоподъемность " + getCarrying();
    }

}

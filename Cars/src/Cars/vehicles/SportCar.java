package Cars.vehicles;

import Cars.details.Engine;
import Cars.professions.Driver;

public class SportCar extends Car {

    private double speed;

    public SportCar(String mark, String carClasses, double weight, Driver driver, Engine motor,
                    double speed) {
        super(mark, carClasses, weight, driver, motor);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
        @Override
        public String toString() {
            return "Спорткар:\n" +
                    "Марка '" + getMark() + '\'' +
                    ", класс автомобиля '" + getCarClasses() + '\'' +
                    ", вес " + getWeight() +
                    ", водитель " + getDriver() +
                    ", двигатель: " + getMotor() +
                    ", предел скорости " + getSpeed();
        }
}



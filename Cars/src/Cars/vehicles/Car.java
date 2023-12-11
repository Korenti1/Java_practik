package Cars.vehicles;

import Cars.details.Engine;
import Cars.professions.Driver;

public class Car {

    private String mark;

    private String carClasses;

    private double weight;

    private Driver driver;

    private Engine motor;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCarClasses() {
        return carClasses;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    public Car(String mark, String carClasses, double weight, Driver driver, Engine motor) {
        this.mark = mark;
        this.carClasses = carClasses;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }

    public void start() {
        System.out.println("Вперед");
    }

    public void stop() {
        System.out.println("Назад");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Машина:\n" +
                "Марка '" + getMark() + '\n' +
                ", класс автомобиля '" + getCarClasses() + '\n' +
                ", вес " + getWeight() +
                ", водитель " + getDriver() +
                ", двигатель " + getMotor();
    }

}

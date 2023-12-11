package Cars;

import Cars.details.Engine;
import Cars.professions.Driver;
import Cars.vehicles.Lorry;
import Cars.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Engine audiEngine = new Engine(300, "Audi");
        Driver audiDriver = new Driver("Даниил", "Иванов", "Гаврилович", 3, 28);
        SportCar audi = new SportCar("Audi", "Среднеразмерный", 2.20,
                audiDriver, audiEngine, 330);

        Engine bmwEngine = new Engine(300, "Bmw");
        Driver bmwDriver = new Driver("Олег", "Давыдов", "Станиславович", 10, 38);
        Lorry bmw = new Lorry("Bmw", "Минивен", 5.45,
                bmwDriver, bmwEngine, 20);

        System.out.println(audi.toString());
        System.out.println(bmw.toString());

        System.out.println("\n\n");
        audi.start();
        audi.stop();
        bmw.turnRight();
        bmw.turnLeft();

    }
}
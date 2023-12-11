package Animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Браво"),
                new Cat("Астольф"),
                new Bear("Чизбугер")
        };
        Vet vet = new Vet();
        for (int i=0;i< animals.length;i++) {
            vet.treatAnimal(animals[i]);
            System.out.println("\n");
        }

        String[] food = {"Мясо", "Молоко", "Рыба"};
        for (int i=0;i< animals.length;i++) {
            System.out.println(animals[i].getName()+ ":");
            animals[i].eat(food);
            animals[i].makeNoise();
            System.out.println();
        }
    }
}
package Animals;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяукает");
    }

    @Override
    public void eat(String[] foods) {
        for (int i=0; i<foods.length; i++)
            System.out.print(foods[i] + " ");
        System.out.println();
    }

    @Override
    public String getDescription() {
        return  "Это кот, толстый и худой, но это кот";
    }

}

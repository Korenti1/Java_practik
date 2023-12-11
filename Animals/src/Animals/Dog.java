package Animals;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Гавкает");
    }

    @Override
    public void eat(String[] foods) {
        for (int i=0; i<foods.length; i++)
            System.out.print(foods[i] + " ");
        System.out.println();
    }

    @Override
    public String getDescription() {
        return  "Это собака, грубая или милая, но это собака";
    }

}

package Animals;

public class Bear extends Animal{

    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Рычит");
    }

    @Override
    public void eat(String[] foods) {
        for (int i=0; i<foods.length; i++)
            System.out.println(foods[i] + " ");
        System.out.println();
    }

    @Override
    public String getDescription() {
        return "Это медведь, большой или маленький, но это медведь";
    }

}

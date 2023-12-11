package Animals;

abstract public class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();

    public abstract void eat(String[] foods);

    public abstract String getDescription();


}

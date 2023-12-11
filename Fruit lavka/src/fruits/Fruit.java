package fruits;

public abstract class Fruit {
    private double _weight;
    private int _priceForKg;
    public Fruit(double weight, int priceForKg) {
        _weight = weight;
        _priceForKg = priceForKg;
    }
    public final void printManufacturer(){
        System.out.println("Made in Russia");
    }
    public abstract double getPrice();


    public double get_weight() {
        return _weight;
    }


    public void set_weight(double weight) {
        _weight = weight;
    }


    public int get_priceForKg() {
        return _priceForKg;
    }


    public void set_priceForKg(int priceForKg) {
        _priceForKg = priceForKg;
    }
}

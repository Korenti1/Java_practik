package fruits;


public class Pear extends Fruit{
    public Pear(double weight, int priceForKg) {
        super(weight, priceForKg);
    }
    @Override
    public double getPrice() {
        return this.get_weight() * this.get_priceForKg();
    }
}


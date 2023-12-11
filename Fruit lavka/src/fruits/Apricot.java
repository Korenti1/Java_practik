package fruits;

public class Apricot extends Fruit{
    public Apricot(double weight, int priceForKg) {
        super(weight, priceForKg);
    }
    @Override
    public double getPrice() {
        return this.get_weight() * this.get_priceForKg();
    }
}

package fruits;

public class Apple extends Fruit {


    public Apple(double weight, int priceForKg) {
        super(weight, priceForKg);
    }
    @Override
    public double getPrice() {
        return this.get_weight() * this.get_priceForKg();
    }
}

package fruits;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(44, 23);
        Pear pear = new Pear(5, 100);
        Apricot apricot = new Apricot(78, 788);
        Fruit[] fruits = {apple, pear, apricot};
        double sum = 0;
        for (Fruit fruit: fruits) {
            sum += fruit.getPrice();
        }
        System.out.println("All price: ");
        System.out.println(sum);
        System.out.println("Price of fruits");
        System.out.println(apple.getPrice());
        System.out.println(pear.getPrice());
        System.out.println(apricot.getPrice());
    }
}

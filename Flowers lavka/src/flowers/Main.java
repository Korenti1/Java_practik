package flowers;


public class Main {
    public static void main(String[] args) {
        Flower[] bouquet1 = {
                new Rose("Netherland", 4, 78),
                new Rose("Russia", 4, 618),
                new Rose("Belarus", 4, 78),
        };
        Flower[] bouquet2 = {
                new Rose("Netherland", 4, 78),
                new Tulip("Russia", 2, 45),
                new Carnation("Abebra", 3, 78),
                new Rose("Netherland", 4, 78),
                new Tulip("Russia", 3, 542),
                new Rose("Netherland", 4, 876)
        };
        Flower[] bouquet3 = {
                new Rose("Netherland", 4, 1000),
        };
        System.out.println("Price of bouquets");
        System.out.println(priceOfBouquet(bouquet1));
        System.out.println(priceOfBouquet(bouquet2));
        System.out.println(priceOfBouquet(bouquet3));
        System.out.println("Count of sold flowers");
        System.out.println(Rose.count);
        System.out.println(Tulip.count);
        System.out.println(Carnation.count);
    }
    private static int priceOfBouquet(Flower[] bouquet){
        int price = 0;
        for (Flower flower: bouquet) {
            price += flower.get_price();
        }
        return price;
    }
}

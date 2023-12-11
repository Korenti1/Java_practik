package flowers;


public class Tulip extends Flower{
    public static int count = 0;
    public Tulip(String manufacturer, int dateOfUse, int price) {
        super(manufacturer, dateOfUse, price);
        count++;
    }
}

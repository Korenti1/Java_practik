package flowers;


public class Carnation extends Flower{
    public static int count = 0;
    public Carnation(String manufacturer, int dateOfUse, int price) {
        super(manufacturer, dateOfUse, price);
        count++;
    }
}

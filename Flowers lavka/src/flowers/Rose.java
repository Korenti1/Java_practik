package flowers;


public class Rose extends Flower{
    public static int count = 0;
    public Rose(String manufacturer, int dateOfUse, int price) {
        super(manufacturer, dateOfUse, price);
        count++;
    }
}

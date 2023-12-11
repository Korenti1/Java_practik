package flowers;


public class Flower {
    private String _manufacturer;
    private int _dateOfUse;
    private int _price;


    public Flower(String manufacturer, int dateOfUse, int price) {
        _manufacturer = manufacturer;
        _dateOfUse = dateOfUse;
        _price = price;
    }


    public String get_manufacturer() {
        return _manufacturer;
    }


    public void set_manufacturer(String manufacturer) {
        _manufacturer = manufacturer;
    }


    public int get_dateOfUse() {
        return _dateOfUse;
    }


    public void set_dateOfUse(int dateOfUse) {
        _dateOfUse = dateOfUse;
    }


    public int get_price() {
        return _price;
    }


    public void set_price(int price) {
        _price = price;
    }
}


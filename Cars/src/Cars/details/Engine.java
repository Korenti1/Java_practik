package Cars.details;

public class Engine {

    private double power;

    private String manufacturer;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "\nМощность " + power +
                ", Производитель: " + manufacturer;
    }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public Engine(double power, String manufacturer) {
            this.power = power;
            this.manufacturer = manufacturer;
        }
    }



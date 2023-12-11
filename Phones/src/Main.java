import java.util.Objects;
public class Main {


    public static void main(String[] args) {
        Phone phone1 = new Phone("+71234567890", "A-54", 1408.0);
        Phone phone2 = new Phone("+70987654321", "IPhone 13 Pro Max", 5228.0);
        Phone phone3 = new Phone("+76789854321", "Poco X5", 783.0);


        Phone[] phones = {phone1, phone2, phone3};


        for (Phone phone : phones) {
            System.out.println(phone.toString());
        }


        phone1.receiveCall("Tinkoff");
        phone2.receiveCall("RazvodNaDengi", phone1.getNumber());
        phone1.sendMessage(phone1.getNumber(), phone2.getNumber(), phones[2].getNumber());
    }


    private static class Phone {


        private String number;
        private String model;
        private double weight;


        public Phone(String number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }


        public Phone(String number, String model) {
            this(number, model, 0.0);
        }


        public Phone() {
            this("", "");
        }


        public String getNumber() {
            return number;
        }


        public String getModel() {
            return model;
        }


        public double getWeight() {
            return weight;
        }


        public void receiveCall(String caller, String number) {
            System.out.println(caller + " is calling " + number);
        }


        public void receiveCall(String caller) {
            System.out.println(caller + " is calling ");
        }


        public void sendMessage(String sender, String recipient, String message) {
            System.out.println(sender + " is sending message " + message + " to " + recipient);
        }


        @Override
        public String toString() {
            return "Phone{" +
                    "number='" + number + '\'' +
                    ", model='" + model + '\'' +
                    ", weight=" + weight +
                    '}';
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Phone phone = (Phone) o;
            return Double.compare(weight, phone.weight) == 0 && Objects.equals(number, phone.number) && Objects.equals(model, phone.model);
        }


        @Override
        public int hashCode() {
            return Objects.hash(number, model, weight);
        }
    }
}

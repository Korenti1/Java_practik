import com.work.booking.entity.*;

public class Main {
    public static void main(String[] args) {
        Bill loriBill = new Bill(10000);
        Client loriClient = new Client("Lori", "Cat",
                "+79084748231", "lori@cat.xyz", loriBill);
        Bill baxBill = new Bill(12000);
        Client baxClient = new Client("Bax", "Cat",
                "+79619227465", "bax@cat.xyz", baxBill);

        Room[] rostovdonHotelRooms = new Room[]{new Room(1, 1500, true),
            new Room(3, 3500, true),
            new Room(2, 2500, true)};
        Hotel rostovdonHotel = new Hotel("Rostov-on-Don", rostovdonHotelRooms);

        Room[] mocsowRooms = new Room[]{new Room(2, 2800, true),
            new Room(3, 40000, true),
            new Room(1, 2000, true)};
        Hotel moscowHotel = new Hotel("Moscow", mocsowRooms);

        BookingService bookingService = new BookingService();
        bookingService.book(rostovdonHotel, loriClient, 2);
        System.out.println("\n");
        bookingService.book(rostovdonHotel, loriClient, 4);
        System.out.println("\n");
        bookingService.book(moscowHotel, baxClient, 3);
    }
}
package com.work.booking.entity;

public class BookingService {

    public void book(Hotel hotel, Client client, int numberOfPerson){
        Room[] rooms = hotel.getRooms();
        boolean isFreeRooms = false;
        for (Room r : rooms){
            if (r.isFree()){
                isFreeRooms = true;
                bookRoom(client, numberOfPerson, rooms);
                break;
            }
        }
        if (!isFreeRooms){
            System.out.println("Свободный номер в отеле: " + hotel.getName() + " нет");
        }
    }

    private static void bookRoom(Client client, int numberOfPerson, Room[] rooms) {
        boolean succes = false;
        String clientName = client.getName();
        for (Room room : rooms){
            if (room.getNumberOfPerson() == numberOfPerson){
                succes = true;
                System.out.println("Нашёлся номер для пользователя: " + clientName);
                if (client.getBill().getAmount() >= room.getCost()){
                    Bill clientBill = client.getBill();
                    clientBill.setAmount(clientBill.getAmount() - room.getCost());
                    room.setFree(false);
                    System.out.println("Номер был успешно забронирован клиентов: "
                    + clientName);
                    succes = true;
                } else {
                    System.out.println("Недостаточно средств для бронирования номера, клиент: "
                    + clientName);
                }
            }
        }
        if (!succes){
            System.out.println("Не нашлось подходящего номера для клиента: " +clientName);
        }
    }

}

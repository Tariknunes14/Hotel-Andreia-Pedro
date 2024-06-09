import javax.swing.*;

public class Playground {
    public static void main(String[] args) {

        Bank bank = new Bank(20);
        bank.spend(100);
        bank.deposit(200);
        System.out.println(bank.hasMoney(500));

        RoomType roomType1 = RoomType.SINGLE;
        RoomType roomType2 = RoomType.DOUBLE;
        Room room1 = new Room(roomType2, 30, true, 200);
        Room room2 = new Room(roomType1, 24, false, 300);
        Hotel hotel = new Hotel("Continental", 5);
        Person person1 = new Person("Andreia", bank, 45, hotel);
        Hotel hotel4 = new Hotel("Douro", 5);

        System.out.println(room1.getRoomId());
        System.out.println(room1.getRoomType());
        System.out.println(room1.isAvailable());
        room1.occupy();
        System.out.println(room1.isAvailable());
        System.out.println(room1.getPrice());
        System.out.println(room1.getRoomType());
        room1.vacate();
        System.out.println(room1.isAvailable());

        room1.displayRoomType();
        person1.checkIn(roomType1);
        person1.checkOut(hotel);
        person1.depositMoney(100);
        //System.out.println(roomType1.valueOf());
        //System.out.println(roomType2.getBasePrice());
        //System.out.println(roomType2.name());
        //System.out.println(roomType1.getDisplayName());

    }
}
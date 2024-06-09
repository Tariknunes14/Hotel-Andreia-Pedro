public class Person {

    private String name;
    private Bank bank;
    private int roomId;
    private Hotel hotel;

    public Person(String name, Bank bank, int roomId, Hotel hotel) {
        this.name = name;
        this.bank = bank;
        this.roomId = roomId;
        this.hotel = hotel;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void depositMoney(int depositAmount) {
        bank.deposit(depositAmount);
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public boolean checkOut(Hotel hotel) {
        //A person can only check out of a hotel that they’re staying at.
        hotel.checkOut(roomId);
        return true;
    }

    public String getName() {
        return name;
    }

    public int getRoomId() {
        return roomId;
    }


    public boolean checkIn(RoomType roomType) {
        //A person can only check in to a hotel they’re not already staying at.
        if(!bank.hasMoney(roomType.getBasePrice())){
            hotel.checkIn(roomType);
            System.out.println("You don't have enough money.");
            return false;
        }
        roomId = hotel.checkIn(roomType);
        if (roomId == 0) {
            System.out.println("We didn't find a room.");
            return false;
        } else {
            System.out.println("We found your room.");
            bank.spend(roomType.getBasePrice());
            return true;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", bank=" + bank +
                ", roomId=" + roomId +
                ", hotel=" + hotel +
                '}';
    }
}

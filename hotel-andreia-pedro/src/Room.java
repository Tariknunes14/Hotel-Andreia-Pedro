import java.awt.*;

public class Room {
    RoomType roomType;
    private int roomId;
    private boolean isAvailable;
    private int price;

    public Room(RoomType roomType, int roomId, boolean isAvailable, int price) {
        this.roomType = roomType;
        this.roomId = roomId;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public int getPrice() {
        return price;
    }

    public int getRoomId() {
        return roomId;
    }

    public void occupy() {
        if (isAvailable()) {
            System.out.println("The room successfully checked-in");
            isAvailable = false;
        }
        else {
            System.out.println("The room is already occupied");
        }
    }

    public String displayRoomType() {
        return "The room is " + getRoomType().getDisplayName();
    }

    public void vacate() {
        if (isAvailable()) {
            System.out.println("Cannot perform action, room already free");
        }
        else {
            System.out.println("The room will be free after 12pm");
            isAvailable = true;
        }

    }
}

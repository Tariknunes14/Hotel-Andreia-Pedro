import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Hotel {

    private String name;
    private int numOfRooms;
    //private ArrayList<Room> rooms = new ArrayList<>();
    private Room[] rooms;


    public Hotel(String name, int numOfRooms) {
        this.name = name;
        this.numOfRooms = numOfRooms;
        rooms = new Room[numOfRooms];

        Random random = new Random();
        // Generate a random number between 1 and 3 (inclusive)

        for (int i = 0; i < numOfRooms; i++) {
            int randomNumber = random.nextInt(3) + 1;
            switch (randomNumber){
                case 1:
                    rooms[i] = new Room(RoomType.SINGLE,i+1,true,RoomType.SINGLE.getBasePrice());
                    break;
                case 2:
                    rooms[i] = new Room(RoomType.DOUBLE,i+1,true,RoomType.DOUBLE.getBasePrice());
                    break;
                case 3:
                    rooms[i] = new Room(RoomType.SUITE,i+1,true,RoomType.SUITE.getBasePrice());
                    break;
            }
        }
    }

    public void checkOut(int roomId) {
        for (int i = 0; i < numOfRooms; i++) {
        //for (Room room : rooms) {
            if (roomId == rooms[i].getRoomId()) {
                if (!rooms[i].isAvailable()) {
                    rooms[i].vacate();
                    System.out.println("The " + rooms[i].getRoomId() + " was checked out.");
                    return;
                }
            }
        }
    }

    public Room[] getRooms() {
        return rooms;
    }

    public String getName() {
        return name;
    }


    public int checkIn(RoomType roomType) {
        for (int i = 0; i < numOfRooms; i++) {
        //for (Room room : rooms) {
            if (rooms[i].isAvailable() && rooms[i].getRoomType() == roomType) {
                rooms[i].occupy();
                System.out.println("The " + rooms[i].getRoomId() + " was checked in.");
                return rooms[i].getRoomId();
            }
        }
        // didn't find  the room
        return 0;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", numOfRooms=" + numOfRooms +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
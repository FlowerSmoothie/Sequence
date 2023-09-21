package Lab;

import java.util.ArrayList;
import java.util.List;

import ClientPackage.UI;

public class main {

    public static RoomDatabase rd;

    public static void main(String[] args)
    {
        rd = new RoomDatabase();

        List<Room> roomsList = new ArrayList<Room>();

        Room r1 = new Room(1, true, 100);
        roomsList.add(r1);
        Room r2 = new Room(2, false, 90);
        roomsList.add(r2);
        Room r3 = new Room(3, true, 120);
        roomsList.add(r3);
        Room r4 = new Room(4, true, 95);
        roomsList.add(r4);
        Room r5 = new Room(5, false, 99.99f);
        roomsList.add(r5);
        Room r6 = new Room(6, true, 115);
        roomsList.add(r6);
        Room r7 = new Room(7, false, 125);
        roomsList.add(r7);
        Room r8 = new Room(8, true, 90);
        roomsList.add(r8);

        rd.setRooms(roomsList);

        UI.operateWithHotel();
    }

}

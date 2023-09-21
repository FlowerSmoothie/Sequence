package Lab;

import java.util.ArrayList;
import java.util.List;

import static Lab.main.rd;

public class Administration {

    public static int processAnOrder(Order order)
    {

        List<Room> rooms = new ArrayList<Room>();
        rooms = rd.getRooms();
        Room r = new Room(0, false, 999);
        int number = order.getNumber();
        int found = 0;

        for(int i = 0; i < rooms.size(); i++)
        {
            r = rooms.get(i);
            if(r.getNumber() == number)
            {
                found = 1;
                break;
            }
        }

        if(found == 0) return 2;

        return (r.checkFree()) ? 1 : 0;
    }

    public static void updateRoom(Order order)
    {
        List<Room> rooms = new ArrayList<Room>();
        rooms = rd.getRooms();
        Room r = new Room(0, false, 999);
        int number = order.getNumber();

        for(int i = 0; i < rooms.size(); i++)
        {
            r = rooms.get(i);
            if(r.getNumber() == number)
            {
                r.setFree(false);
                break;
            }
        }
    }

}

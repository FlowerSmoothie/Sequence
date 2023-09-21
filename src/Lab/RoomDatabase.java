package Lab;

import java.util.List;

public class RoomDatabase {
    List<Room> rooms;

    protected void setRooms(List<Room> rooms)
    {
        this.rooms = rooms;
    }

    public void printRoomsList()
    {
        for(int i = 0; i < rooms.size(); i++)
            System.out.println(rooms.get(i).toString());
    }

    public List<Room> getRooms()
    {
        return rooms;
    }

}

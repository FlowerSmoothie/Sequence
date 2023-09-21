package Lab;

import java.util.ArrayList;
import java.util.List;

import static Lab.main.rd;


public class PaymentSystem {

    public static float payOrder(Order o)
    {

        List<Room> rooms = new ArrayList<Room>();
        rooms = rd.getRooms();
        int roomNum = o.getNumber();
        int nights = o.getNightCount();

        float price = 0;

        for(int i = 0; i < rooms.size(); i++)
            if(rooms.get(i).getNumber() == roomNum) price = rooms.get(i).getPrice();

        return price * nights + (o.getBreakfast() ? 5 * nights : 0);
    }
}

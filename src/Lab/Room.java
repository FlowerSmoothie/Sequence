package Lab;

import java.util.List;

public class Room {

    int number;
    boolean isFree;

    float price;
    public void setFree(boolean isFree) { this.isFree = isFree; }
    public boolean checkFree() { return isFree; }
    public int getNumber() { return number; }
    public void setNumber(int num) { number = num; }
    public float getPrice() { return price; }

    Room(int number, boolean isFree, float price)
    {
        this.number = number;
        this.isFree = isFree;
        this.price = price;
    }

    public String toString()
    {
        String s;
        if(isFree) s = new String("Room number " + number + ", price: " + price + ", can be booked");
        else s = new String("Room number " + number + ", price: " + price + ", cannot be booked");
        return s;
    }

}

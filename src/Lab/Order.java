package Lab;

public class Order {

    private int roomNumber;
    private boolean hasBreakfast;

    private int nightCount;

    public void setRoomNumber(int num) { roomNumber = num; }

    public void setBreakfast(boolean breakfast) { hasBreakfast = breakfast; }

    public void setNightCount(int num) { nightCount = num; }

    public int placeOrder() { return Administration.processAnOrder(this); }

    public int getNumber() { return roomNumber; }

    public boolean getBreakfast() { return hasBreakfast; }

    public int getNightCount() { return nightCount; }

}

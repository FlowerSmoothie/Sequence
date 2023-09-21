package ClientPackage;

import Lab.Administration;
import Lab.Order;
import Lab.PaymentSystem;

import java.util.Scanner;

import static Lab.main.rd;

public class UI {

    static void helloMsg() {
        System.out.println("Hello, user");
    }
    static void printMenu()
    {
        System.out.println("Something has changed and you'll never know what huh");
        System.out.println("1 - Get rooms list");
        System.out.println("2 - Place an order");
        System.out.println("3 - Pay an order");
        System.out.println("4 - Exit");
    }

    public static void operateWithHotel()
    {
        int inputted, answer = 0;
        Scanner s;
        Order order = new Order();
        while(true)
        {
            printMenu();
            while(true)
            {
                s = new Scanner(System.in);
                if(s.hasNextInt())
                {
                    inputted = s.nextInt();
                    if(inputted > 0 && inputted <= 4) break;
                }
                System.out.println("Wrong input!");
            }
            switch(inputted)
            {
                case 1:
                    rd.printRoomsList();
                    break;
                case 2:
                    order = new Order();
                    while(true)
                    {
                        System.out.println("Enter room number: ");
                        s = new Scanner(System.in);
                        if(s.hasNextInt())
                        {
                            inputted = s.nextInt();
                            if(inputted > 0)
                            {
                                order.setRoomNumber(inputted);
                                break;
                            }
                        }
                        System.out.println("Wrong input!");
                    }
                    while(true)
                    {
                        System.out.println("Enter count of nights: ");
                        s = new Scanner(System.in);
                        if(s.hasNextInt())
                        {
                            inputted = s.nextInt();
                            if(inputted > 0)
                            {
                                order.setNightCount(inputted);
                                break;
                            }
                        }
                        System.out.println("Wrong input!");
                    }
                    while(true)
                    {
                        System.out.println("Enter breakfast (0 - without, 1 - with): ");
                        s = new Scanner(System.in);
                        if(s.hasNextInt())
                        {
                            inputted = s.nextInt();
                            if(inputted == 0 || inputted == 1)
                            {
                                order.setBreakfast(inputted != 0);
                                break;
                            }
                        }
                        System.out.println("Wrong input!");
                    }
                    answer = order.placeOrder();
                    switch(answer)
                    {
                        case 0:
                            System.out.println("Error while placing an order. Room is already reserved.");
                            break;
                        case 1:
                            System.out.println("Placed an order successfully! Please pay for it.");
                            break;
                        case 2:
                            System.out.println("Error while placing an order. There is no such room.");
                            break;
                    }
                    break;
                case 3:
                    if(answer != 1) System.out.println("There isn't anything to pay yet!");
                    else
                    {
                        System.out.println("You should pay " + PaymentSystem.payOrder(order) + " smeshinki");
                        while(true)
                        {
                            System.out.println("Enter 1 to pay and 0 to decline: ");
                            s = new Scanner(System.in);
                            if(s.hasNextInt())
                            {
                                inputted = s.nextInt();
                                if(inputted == 0 || inputted == 1)
                                    break;
                            }
                            System.out.println("Wrong input!");
                        }
                        answer = 0;
                        if(inputted == 1)
                        {
                            System.out.println("Success!");
                            Administration.updateRoom(order);
                        }
                    }
                    break;
                case 4:
                    return;
            }
        }
    }

}

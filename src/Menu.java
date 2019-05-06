import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main (String[] args) {
        int input;
        String date;
        String name;
        double buyPrice;
        double currentPrice;
        boolean done=false;
        ArrayList<Item> inventory = new ArrayList<>();

        Scanner scan=new Scanner(System.in);

        while(!done) {
            System.out.println("CHOOSE A FUNCTION");
            System.out.println("    1) add item to inventory");
            System.out.println("    2) print inventory");
            System.out.println("    3) depreciate current value of object by 10%");
            System.out.println("    4) quit");
            input= scan.nextInt();

            if(input==1) {
                System.out.println("give item name");
                name=scan.next();
                System.out.println("give item date");
                date=scan.next();
                System.out.println("give item buy price");
                buyPrice=scan.nextDouble();
                System.out.println("give item current price");
                currentPrice=scan.nextDouble();

                inventory.add(new Item(name,date,buyPrice,currentPrice));
                System.out.println("ITEM ADDED SUCCESSFULLY");

            }
            else if (input==2){
                for(Item item: inventory){
                    item.print();
                }
            }
            else if (input==3) {
                for(Item item:inventory){
                    item.setCurrentPrice(item.getPrice()*0.9);
                }
            }
            else if(input==4) {
                done=true;
            }

            else System.out.println("Invalid input, try again");

        }


    }

}

package Replit;
import java.util.Scanner;
public class Replit34_VendingMachine {
    public static void main(String[] args) {
        //ENTER CODE HERE

        Scanner input= new Scanner(System.in);


        System.out.println("Enter price in cents:");
        int itemPrice= input.nextInt();


        int change=100- itemPrice;

        int quarters= change/25;

        int dimes= (change-quarters*25)/10;
        int nickels= (change-quarters*25-dimes*10)/5;

      String result= "Your change is "+quarters+" quarters, "+dimes+" dimes, and" +nickels+" nickels.";

        if(itemPrice>25 && itemPrice<100){
            if(itemPrice%5==0) {
                System.out.println(result);
            }else{
                System.out.println("Invalid price!");
            }
        } else {
            System.out.println("Invalid price!");
        }






    }
}
  /*

        int dimes=(change-quarters*25)/10;
        int nickel=(change-quarters*25-dimes*10)/5;

        String result="Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickel+" nickels.";

        if (itemPrice>=25 && itemPrice<=100){
        if (itemPrice%5==0){
        System.out.println(result);
        } else System.out.println("Invalid price!");
        } else  {
        System.out.println("Invalid price!");
        }*/
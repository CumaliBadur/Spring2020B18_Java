package Replit;

import java.util.Scanner;

public class Replit035_ArthimetricOpr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        //WRITE YOUR CODE HERE

        int giftcard=100;
       // String item1="Hat";
        //String item2="Pants";
       // String item3="Laptop";
      //  String item4="Cupcake";

        if(item.contains("Charger")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftcard-15)+"$");

        }else if(item.contains("USB cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftcard-10)+"$");

        }else if(item.contains("Headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftcard-30)+"$");

        }else if(item.contains("Socks")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftcard-5)+"$");

        }else if(item.contains("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftcard-60)+"$");

        }else if(item.contains("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftcard-40)+"$");

        }else if(item.contains("Hat")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftcard-25)+"$");

        }else if(item.contains("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftcard-50)+"$");

        }else if(item.contains("Laptop") || item.contains("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");

        }else{
            System.out.println("Invalid item!");
        }
    }
}


/*
and display leftover balance after purchase. If item is not in the list, display message: "Invalid item!". If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".

Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!*/

    /* this my first solutions:  boolean con = item.contains("Smartphone") || item.contains("Laptop") || item.contains("Charger") ||
                item.contains("USB cable") || item.contains("HeadPhones") || item.contains("Pants") ||
                item.contains("Hat") || item.contains("Socks") || item.contains("Blanket") ||
                item.contains("Pillow");*/


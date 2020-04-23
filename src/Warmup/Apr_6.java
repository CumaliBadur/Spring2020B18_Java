package Warmup;

import java.util.Scanner;

/*Warmup tasks:
    1. write a program that can ask the user "enter a number"
    five times and return the maximum number
                hint: you will nedd for loop and if statement
*/
public class Apr_6 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
         int number=input.nextInt();


        for(number = 1; number<5; number++){
            System.out.println(number);


        }











    }
}

package Replit;

import java.util.Scanner;

public class Replit55_Switch {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE


        Scanner scan= new Scanner(System.in);


        System.out.println("Enter number");
        int weekday= scan.nextInt();



        switch(weekday){

            case 1:
                System.out.println("Monday");
                break;


            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wendnesday");
                break;



            case 4:
                System.out.println("Thursday");
                break;


            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

        }


    }
}
/* Write a program that will print a week day according to the day number. Use switch statement.


Example
Display message: "Enter number:"
1
Display message: "Monday"*/
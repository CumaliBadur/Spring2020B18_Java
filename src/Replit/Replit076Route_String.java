package Replit;

import java.util.Scanner;

public class Replit076Route_String {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();





        String result= (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("A"))?"A found":

         (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("B"))?"right: B found":

         (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("C"))?"right > down: C found":

         (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("D"))?"right > down > left: D found":


         (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("B"))?"B found":

         (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("C"))?"down: C found":

         (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("D"))?"down > left: D found":

         (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("A"))?"down > left > up: A found":


         (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("C"))?"C found":

         (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("D"))?"left: D found":

         (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("A"))?"left > up: A found":

         (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("B"))?"left > up > right: B found":


         (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("D"))?"D found":

         (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("A"))?"up: A found":

         (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("B"))?"up > right: B found":

         (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("C"))?"up > right > down: C found":"Invalid";


        System.out.println(result);




}

        }



  /*  Instructions from your teacher:
        Write a program that will print out route instructions. Your program should take 2 parameters: start point and end point. Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to end point - display: "start/end(start or end variable!) found".
        Note: you may move only clock wise.

        Example:
        Input: A
        Input: D
        Output: right > down > left: D found

        Input: C
        Input: C
        Output: C found


*/
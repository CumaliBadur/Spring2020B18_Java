package Replit;

import java.util.Scanner;

public class Replit060_Last_Character  {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        String last= word.substring(word.length()-1);


        //char last = word.charAt(word.length() -1);


        System.out.println(last);

    }
}

  //  Write a program that will print out last letter of the word (string).
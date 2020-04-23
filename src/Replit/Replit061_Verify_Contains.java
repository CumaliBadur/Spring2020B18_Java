package Replit;

import java.util.Scanner;

public class Replit061_Verify_Contains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE


        boolean out=sentence.contains((word));
        System.out.println(out);

    }
}


  /*  Write a program that will verify if word contains in the sentence.
        Print out the result as boolean value. */
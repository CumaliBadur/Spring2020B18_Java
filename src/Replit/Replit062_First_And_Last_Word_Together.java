package Replit;

import java.util.Scanner;

public class Replit062_First_And_Last_Word_Together  {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE






        String first= word.substring(0,1);
        String last= word.substring(word.length()-1);

        System.out.println(first+last);















    }
}
/*Instructions from your teacher:
Write a program that will print out first and last letters together.



adobe
ae*/
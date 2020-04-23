package Replit;

import java.util.Scanner;

public class StringhLenght {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name");
        String name =input.next();


        //int lenght= name.length();
        System.out.println(name.length());


    }
}/*ask the user for his name, capture it on a string using scanner.

then output the length of the name string.*/
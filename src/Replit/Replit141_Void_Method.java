package Replit;

import java.util.Scanner;

public class Replit141_Void_Method {
    public static void main(String[] args) {

cube();


    }

    public static void cube(){

        Scanner input= new Scanner(System.in);
        int n=input.nextInt();

        System.out.println(n*n*n);

    }



}
/*Given method called cube. Write all required code inside this
 method in order  to asks the user for a number and then prints the cubed
 value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n*/
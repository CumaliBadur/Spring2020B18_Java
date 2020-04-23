package Replit;

import java.util.Scanner;

public class Replit069_Half_Twice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE



    String  word1= word.substring(0,word.length()/2);


       System.out.println(word1+word1);




        //String firstHalf = word.substring(0,word.length()/2);
       // System.out.println(firstHalf.concat(firstHalf));




    }
}


/*Instructions from your teacher:
Write a program that will print out first half of the word twice.



Example:

input: java
output: jaja*/
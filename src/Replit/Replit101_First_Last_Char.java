package Replit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Replit101_First_Last_Char {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),
                input.nextLine(),input.nextLine(),input.nextLine()};

        //TODO: Write your code below
        for (String eachWord : words){
            System.out.println( eachWord.substring(0,1)+
                   eachWord.substring(eachWord.length()-1));
        }
    }
}
/*Instructions from your teacher:
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
*/
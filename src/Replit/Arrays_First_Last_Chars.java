package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_First_Last_Chars  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),
                input.nextLine(),input.nextLine(),input.nextLine()};




        for (String eachWord:words){
            eachWord=eachWord.charAt(0)+""+eachWord.charAt(eachWord.length()-1);
            System.out.println(eachWord);
        }




    }
}

/*
Instructions from your teacher:
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
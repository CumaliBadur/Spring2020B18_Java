package Replit;

import java.util.Scanner;
import java.util.SortedMap;

public class Replit065_MidleThree  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE




        int middle= word.length()/2;
        String print= "";

        if(word.length()%2 != 0&&(word.length() >=5)){

            print= word.substring(middle-1,middle+1);
            System.out.println(print);
        }else{
            System.out.println("Invalid");
        }



    }
}



   /* Instructions from your teacher:
        You have a word, do the following:

        If the word has odd number of characters
        and has 5 or more characters, print the middle three
        characters of the word.

        Otherwise print "invalid".

        fifteen ==> fte
        apple ==> ppl
        hey ==> invalid
        java ==> invalid
        whatsup ==> ats
        $ ==> invalid*/
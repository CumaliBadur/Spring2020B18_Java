package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit103_Arrays_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String reversed = "";
        //TODO: start your code here

        String[] words = sentence.split(" ");
        Arrays.toString(words);
        for(int i = words.length-1;  i >= 0; i-- ){
            String eachWords =  words[i];
            reversed += " " + eachWords;
            reversed=reversed.trim();
        }
        //End your code here. do not modify below statement
        System.out.println(reversed);
    }
}
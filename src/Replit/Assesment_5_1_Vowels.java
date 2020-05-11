package Replit;

import java.util.Scanner;

public class Assesment_5_1_Vowels {

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String word = inp.nextLine();
            //write your code below

            String vovels = "";

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
                    vovels += ch+" ";
                }


            }
            System.out.println(vovels);
        }

        /*
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
HINT:  vowel is a letter representing a vowel sound, such as a, e, i, o, u.

In: howdyho
oo

In: huehuehuehue
ueueueue


In: poopoo what idk what im doing
ooooaiaioi
         */

    }


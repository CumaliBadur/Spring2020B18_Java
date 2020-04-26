package Replit;

import java.util.Scanner;

public class Replit115_Array_Max {


        public static void main(String[] args) {
            String str="";
            Scanner input = new Scanner(System.in);
            String[] words = new String[5];
            for(int i = 0; i < 5;  i++) {
                words[i] = input.nextLine();

                while(str.length()<words[i].length()){
                    str=words[i];
                }
            }
            System.out.println(str);
        }
    }







/*Instructions from your teacher:
Given the array words, it will print the word with the
 largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa*/
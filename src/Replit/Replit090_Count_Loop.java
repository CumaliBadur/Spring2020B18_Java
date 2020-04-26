package Replit;

import java.util.Scanner;

public class Replit090_Count_Loop {

            public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            String deneme = scan.next();


             int count=0;
String word=deneme.toLowerCase();
             for(int i= 0; i <word.length();i++ ){
                 String s = word.substring(i,word.length());
                if (s.startsWith("java")){
                     count++;
                }

            }
                System.out.println(count);
                }

            }








/*Due: --
submit
Instructions from your teacher:
Return the number of times that the string "java"
appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3*/
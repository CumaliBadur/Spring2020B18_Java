package Replit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Replit106_Array_Split  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String[] news=sentence.split(" ");

for(String each:news){
    System.out.println(each);
}




    }}


 /*Instructions from your teacher:
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun*/

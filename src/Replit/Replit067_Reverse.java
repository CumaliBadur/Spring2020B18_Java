package Replit;

import java.util.Scanner;

public class Replit067_Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int wordint=word.length();





        if(wordint==5){
       System.out.println(word.charAt(4)+""+word.charAt(3)+
            word.charAt(2)+word.charAt(1)+word.charAt(0));



        }else if(wordint<5){
            System.out.println("Too short!");
        }else if(wordint>5){
            System.out.println("Too long!");
        }











/* String reverse="";

   int maxIndex=word.length()-1;

   if(word.length()>5){

     reverse="Too long!";

   }else if(word.length()<5){
     reverse="Too short!";

   }else{
     for (int i=maxIndex; i>=0; i-=1){
       reverse+=""+word.charAt(i);
     }
   }
   System.out.print(reverse);*/















    }
}
/*Instructions from your teacher:
Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.



Example:
input: cat
output: Too short!

Example:
input: singularity
output: Too long!

Example:
input: apple
output: elppa
*/
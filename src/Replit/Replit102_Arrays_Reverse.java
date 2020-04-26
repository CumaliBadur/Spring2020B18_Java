package Replit;

import java.util.Scanner;

public class Replit102_Arrays_Reverse{
    public static void main(String[] args) {

Scanner input= new Scanner(System.in);
String str=input.nextLine();


String[] arr=str.split(" ");


for(int i=arr.length-1;i>=0;i--){
    System.out.println(arr[i]);
}














    }
}
/*
Instructions from your teacher:
Given a String variable sentence, write code
 to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */
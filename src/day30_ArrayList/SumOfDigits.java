package day30_ArrayList;

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {


        String str="a1b2c3";

  char [] arr=   str.toCharArray();

        System.out.println(Arrays.toString(arr));


int sum=0;
for(char each: arr){

   /* boolean isDigit= each>= 48 && each <=57;
    if(isDigit){
       sum+= Integer.parseInt(""+each);

    }*/

if(Character.isDigit(each)){
    sum+= Integer.parseInt(""+each);
}

        }

        System.out.println(sum);

boolean a= Character.isAlphabetic('A');


    }
}

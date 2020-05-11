package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Assesment_Reverse_Array {
    public static void main(String[] args) {


        String rever="cumali";

        String result="";
        //cumali
  for(int i=rever.length()-1; i>=0;  i-- ){
    result+=rever.charAt(i);
}
        System.out.println(result);

       /* for(int i=0;i<rever.length();i++){
            result+=rever.charAt(rever.length()-1-i);*/
        }


    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {





        String[] arr1 = new String[arr.length]; // new Arrays{ str,  str}
        int j = arr.length-1;
        for (int i=0; i<arr.length;i++){
            arr1[i] = arr[j];
            j--;
        }
               return arr1;
    }

}

/*
Write the definition of a method reverse, whose parameter
is an array of Strings. The method reverses the elements of the array. The method returns an array of strings in the reversed order.

Example:

input: ["apple", "pear"]
output: ["pear", "apple"]
 */
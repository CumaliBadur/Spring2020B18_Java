package Replit;

import java.util.Scanner;

public class Replit075_WithoutX_Str_Mth  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if (word.startsWith("X")||word.startsWith("x")){
            word=word.substring(1);
        }
        if (word.endsWith("X")||word.endsWith("x")){
            word=word.substring(0,word.length()-1); // last to first character
            System.out.println(word);
        }
        else {
            System.out.println(word);
        }
    }
}




// one other answer
   /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result = "";

        boolean endWithX = ("" + word.charAt(word.length() - 1)).equalsIgnoreCase("x");
        boolean startWithX = ("" + word.charAt(0)).equalsIgnoreCase("X");
        if (startWithX && endWithX) {
            result = word.substring(1, word.length() - 1);
        } else if (startWithX) {
            result = word.substring(1);
            ;
        } else if (endWithX) {
            result = word.substring(0, word.length() - 1);
        } else {
            result = word;
        }
        System.out.println(result);


    }

}

*/








/*Instructions from your teacher:
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.


Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java*/
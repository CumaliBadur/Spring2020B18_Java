package Replit;

import java.util.Scanner;

public class Replit108_Triangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for(i = 0; i<n; i++){

           for (j=0; j<i; j++){
               System.out.print(i);
}
            System.out.println();
        }





    }
}
/*Assume that the int variables i and j have been declared,
 and that n has been declared and initialized.

Using for loops (you may need more than one), write code
 that will cause a triangle of asterisks of size n to be output to the screen.



Example:
input: 5
output: *
output: **
output: ***
output: ****
output: *****

Example:
input: 3
output: *
output: **
output: ****/
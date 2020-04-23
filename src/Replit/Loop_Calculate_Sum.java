package Replit;

import java.util.Scanner;

public class Loop_Calculate_Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();



     int sum=0;
        for(int i=1 ; i<=n ; i++ ){
            sum += i;
        }
        System.out.print(sum);







    }
}
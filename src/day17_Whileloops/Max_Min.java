package day17_Whileloops;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int MaxNumber= -99999999;
        int minnum=999999999;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

if(num>MaxNumber){
    MaxNumber=num;

}
if(num<minnum){
    minnum=num;
}

        }
        System.out.println("Max num: "+MaxNumber);
        System.out.println("Min Num:" +minnum);
    }

}

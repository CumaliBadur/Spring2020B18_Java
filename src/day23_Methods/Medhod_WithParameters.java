package day23_Methods;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Medhod_WithParameters {


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();

       EligibleToBuyAlcohol(age); // explicit casting





    }


    public static void EligibleToBuyAlcohol(byte age){

        if(age >= 21){
            System.out.println("Eligible to by alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }

    }


}
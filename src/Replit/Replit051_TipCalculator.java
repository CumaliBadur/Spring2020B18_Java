package Replit;

import java.util.Scanner;

public class Replit051_TipCalculator  {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan=new Scanner(System.in);
        String split=scan.next();
        int people=scan.nextInt();
        double checkAmount=scan.nextDouble();
        String service=scan.next();
        if(split.equals("Yes")){
            System.out.println("Split:");
        }else{
            System.out.println("No Split");
        }
        System.out.println("Number of people:");
        System.out.println("Check amount:");
        System.out.println("Service Quality:");
        if(people==1){
            System.out.println("Number of people entered: &");
        }else if (people==2){
            System.out.println("Number of people entered: &&");
        }else if (people==3){
            System.out.println("Number of people entered: &&&");
        }else if (people==4){
            System.out.println("Number of people entered: &&&&");
        }else if (people==5){
            System.out.println("Number of people entered: &&&&&");
        }
        double tip=0;
        if(service.equals("Poor")){
            tip+=checkAmount/100*5;
        }else if(service.equals("Fair")){
            tip+=checkAmount/100*10;
        }else if(service.equals("Good")){
            tip+=checkAmount/100*15;
        }else if(service.equals("Great")){
            tip+=checkAmount/100*20;
        }else if(service.equals("Excellent")){
            tip+=checkAmount/100*25;
        }
        System.out.println("Total to pay: "+(checkAmount+tip));
        System.out.println("Total tip: "+tip);
        if(split.equals("Yes")){
            System.out.println("Total per person: "+((checkAmount+tip)/people));
            System.out.println("Tip per person: "+(tip/people));
        }else{
            System.out.println("Total per person: "+(checkAmount+tip));
            System.out.println("Tip per person: "+tip);
        }
    }
}
/*
 Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
  */
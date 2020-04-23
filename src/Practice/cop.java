package Practice;

import java.util.Scanner;

public class cop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");

        int num=scan.nextInt();

        int total=0;
        do{
            total+=num%10;
            num/=10;

        }while(num> 0);

        System.out.println(total);

selamlama();





    }
    public static void selamlama(){
        System.out.println("Selamla,a");
        System.out.println("asasas");
        System.out.println("sasasaadss");
    }
    }

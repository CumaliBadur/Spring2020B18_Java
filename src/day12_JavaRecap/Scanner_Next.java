package day12_JavaRecap;
import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class Scanner_Next {


    public static void main(String[] args) {


Scanner scan   = new Scanner(System.in);

      //String str= scan.next();

       // System.out.println(str);
String fulladres= "";


        System.out.println("Enter the number of the building");
short Bnumber= scan.nextByte();
fulladres+= Bnumber+" ";


        System.out.println("Enter the Street Name : ");
String streetName = scan.next();
fulladres += streetName+" ";


        System.out.println("Enter the type name of the road");
String roadType = scan.next();
fulladres+= roadType+ ", ";


        System.out.println("Enter City name, state, zipcode");
        String cityname= scan.nextLine();
        fulladres+= cityname+ " ";
        String state= scan.next();
        fulladres += state+", ";
        int zipcode= scan.nextInt();
        fulladres+=zipcode;

        System.out.println("Your full adres is: " +fulladres);






    }

}

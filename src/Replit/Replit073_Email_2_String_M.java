package Replit;

import java.util.Scanner;

public class Replit073_Email_2_String_M{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();




        String firstname=email.substring(0,email.indexOf("_"));
        firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
        System.out.println("First name: "+firstname);


        String lastname=email.substring(email.indexOf("_")+1, email.indexOf("@"));
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();
        System.out.println("Last name: "+lastname);


        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
       // domain=domain.substring(0,1).toUpperCase()+domain.substring(1).toLowerCase();
        System.out.println("Domain: "+domain);


        String toplevel=email.substring(email.indexOf(".")+1);
      //  toplevel=toplevel.substring(0,1).toUpperCase()+toplevel.substring(1).toLowerCase();
        System.out.println("Top-Level Domain: "+toplevel);
    }
}



/*Instructions from your teacher:
Write a program that will print out information about the user based on email. Print first and last name from the email with the upper case. (Assume that first and last names were separated by an underscore)

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com*/
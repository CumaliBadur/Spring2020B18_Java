package Replit;

import java.util.Scanner;

public class Replit072_Email_String_M {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();


  if (email.contains("_")) {
      String firstname = "" + email.substring(email.indexOf("_") + 1, email.indexOf("@"));
      String lastname = "" + email.substring(0, email.indexOf("_"));

      System.out.println(firstname + "_" + lastname + "@gmail.com");

        } else {
            System.out.println(email);
        }

    }
}




/*In this task, you need to swap the first name with the last name in the email. If the email doesn't contain underscore - do not do anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com*/
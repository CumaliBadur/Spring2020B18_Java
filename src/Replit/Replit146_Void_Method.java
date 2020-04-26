package Replit;

import java.util.Scanner;

public class Replit146_Void_Method {



    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {

        //your code here

        String firstName = info.substring(0, info.indexOf(","));
        info = info.replaceFirst(",", " ");
        String lastName = info.substring(info.indexOf(" ") + 1, info.indexOf(","));
        String age = info.substring(info.indexOf(",") + 1, info.length());
        System.out.println("person name: " + firstName + " last name: " + lastName + " age: " + age);
    }






}
/*Instructions from your teacher:
The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char*/
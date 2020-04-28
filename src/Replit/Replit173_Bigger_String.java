package Replit;

public class Replit173_Bigger_String {
    public static String biggerS(String a ,String b) {

//return(a.length()> b.length())? a:b;


        if (a.length() > b.length()) {
            return a;
        } else {
            return b;
        }
    }


    public static void main(String[] args) {
       String  mainresult=   biggerS("cumalisdsd","gamzessdsddss");
        System.out.println(mainresult);
    }


    }
    //the method gets two strings and return the longest one
//
//biggerS("apple","orange") ==> "orange"
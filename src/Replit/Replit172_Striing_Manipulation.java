package Replit;

public class Replit172_Striing_Manipulation {

    public static String at3(String target,String word){



        return target.substring(0,3)+word+target.substring(3);



    }


    public static void main(String[] args) {

    String num=   at3("cumali","musa");

    System.out.println(num);

    }



}







/*Instructions from your teacher:
at3 gets two strings and returns a string.

the first string is the one that will be manipulated.
at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"
*/
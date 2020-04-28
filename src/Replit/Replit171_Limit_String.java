package Replit;

public class Replit171_Limit_String {
    public static String limit(String text, int maxLength) {




        return text.substring(0, maxLength);
    }

    public static void main(String[] args) {

      String numu=  limit("cumali", 3);
 System.out.println(numu);


    }
}






/*Instructions from your teacher:
This method gets a string and an int, it returns a string.

what it dose is limit the inputted string to a cretin number of characters.

for example:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)*/
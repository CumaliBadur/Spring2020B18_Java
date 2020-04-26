package Replit;

public class Replit166_Return_Method {

    public static void main(String[] args) {
        String s =mergeStrings("wooden","spoon");
        System.out.println(s);

    }
    public static String mergeStrings(String one, String two) {
        String result = "";
        int length = 0;

        length = (one.length() > two.length()) ? one.length() : two.length();

        for (int i = 0; i < length; i++) {
            if (i < one.length()) {
                result += one.charAt(i);
            }
            if (i < two.length()) {
                result += two.charAt(i);
            }
        }
        return result;
    }
}



/*When gears merge and work together, one teeth from each one goes in order.
        Write a method mergeStrings hat will return the strings merged, one
        letter at a time, starting with one.   Please note one and two can be
        of different lengths. Please look at below examples:

        s1 ==> "12345"
        s2 ==> "abcde"
        mergeStrings(s1,s2) ==> "1a2b3c4d5e"

        mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

        mergeStrings("java", "selenium") ==> "jsaevlaenium"*/
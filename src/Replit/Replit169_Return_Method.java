package Replit;

public class Replit169_Return_Method {


    public static int wordCount(String words) {
        int count = 0;
        String[] arr = words.split(" ");
        for (String each : arr) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(wordCount("ali, veli"));
    }

}


/*This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)*/
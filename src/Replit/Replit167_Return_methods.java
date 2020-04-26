package Replit;

public class Replit167_Return_methods {



    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("BugBusters") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String result="";

        String arr[]=str.split("");

        for(String each:arr){
            if (!(result.contains(each))){
                result+=each;
            }
        }

        return result;


    }
}


/*uniqueChars is a method that you will code now, should be able to accept any string in the world and return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"*/
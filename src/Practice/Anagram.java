package Practice;

public class Anagram {


    public static  boolean isAnagram(String one, String two){

        if(one.length() != two.length())
            return false;


        int [] count =new int[26];
        for(int i=0;i<one.length(); i++){

          //  count[0]= count[0]+1;
       char c=     one.charAt(i);

       count[c-97]= count [c- 97]+1;




        }


        return true;
    }



}

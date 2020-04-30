package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Replit181_ArrayList_Combine {
    public static String combineRs(String[] r1,String[] r2) {


        ArrayList<String> list=new ArrayList<>();

       // List list = new ArrayList(Arrays.asList(r1));

        list.addAll(Arrays.asList(r2));

        String.join("", list);

        return String.join("", list);
    }
}


/*Instructions from your teacher:
combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"*/
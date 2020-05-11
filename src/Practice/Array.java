package Practice;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> list20=new ArrayList<>();
        list20.add("as");
        list20.add("as");

        String  str=list20.toString();
        System.out.println(str);

        char []ch=str.toCharArray();
        System.out.println(ch[2]);
    }
}

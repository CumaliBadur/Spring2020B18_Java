package Replit;

public class Replit179_Method_Reverse {

    public static void main(String[] args) {

       // System.out.println(reverse("cumali"));

        String ss="";
        String input="gamze";
        for(int i=input.length()-1;i>=0;i--){
            ss+= input.charAt(i);

        }
        System.out.println(ss);

    }



    public static String reverse(String input)

    {
        String ss="";

        for(int i=input.length()-1;i>=0;i--)
        ss+= input.charAt(i);

        return ss;






    }
}

/*Instructions from your teacher:
reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tnedust"

*/
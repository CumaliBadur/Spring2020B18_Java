package Replit;

public class Replit160_Return_Method {


    public static void main(String[] args) {
        boolean c = hamletQuote(false, false);
        System.out.println(c);


    }

    public static boolean hamletQuote(boolean toBe, boolean notToBe) {

        return (toBe == false && notToBe == false) ? false : true;

    }
}

/*The danish prince most famous quote is "to be or not to be".
 thats a classic example of boolean logic.

the hamletQuote method only returns true if one of
 or both of the boolean parameters is true.

example:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false
hint: use the truth table for this one, this can be done
 with one if and a logical operator.
*/
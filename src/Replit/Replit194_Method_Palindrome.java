package Replit;

public class Replit194_Method_Palindrome  {
    public static void main(String[] args) {

        System.out.println(isPalindrome("anna run"));
    }

    public static boolean isPalindrome(String check) {

        check = check.toLowerCase();
        String result1 = "";
        String result2 = "";
        for (int i = 0; i <= check.length() - 1; i++) {
            result1 +=  check.charAt(i);
        }
        for (int i = check.length() - 1; i >= 0; i--) {
            result2 += check.charAt(i);
        }
        result1 = result1.replaceFirst(" ", "");
        result2 = result2.replaceFirst(" ", "");
        if (result1.equals(result2)) {
            return true;
        }
        return false;
    }

}
/*nstructions from your teacher:
Palindrome is a word, phrase, or sequence that reads
the same backward as forward, e.g., madam or nurses run.

So method isPalindrome checks that and returns true if
 check is palindrome and false if it is not.

- make your conditions case insensitive.  ex: Civic and
 civic are both palindromes
- make your conditions space insensitive.  Race car is
a palindrome even though there is space in between.

Examples:

isPalindrome("Noon") ==> true

isPalindrome("I am not palindrome") ==> false

isPalindrome("wooden") ==> false

isPalindrome("Nurses Run") ==> true

*/
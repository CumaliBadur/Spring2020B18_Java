package Replit;

public class Replit156_Return_Method {


    public static void main(String[] args) {
        String str[] = {"Jo", "Fo", "Go", "Lo", "Fo", "Fo"};
        String t2 = "Fo";
        int c = count_appearance(str, t2);
        System.out.println(c);

    }


    public static int count_appearance(String[] arr, String t) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(t)) {
                count++;
            }
        }
        return count;
    }
}








/*Instructions from your teacher:
Create a method that gets an array of strings and a string, the method returns an int.

It counts how many times a string appears in the array and returns the count.

for example (pseudo code):

some_array = ["a","foo","bar","foo","bla"]

some_string = "foo"

count_appearance(some_array ,some_string )

will return 2 because some_array  has 2 appearances of "foo" string.
*/
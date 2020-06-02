package Practice;

public class String_Manipule {


    public boolean xyThere(String str) {




        for (int i = 0; i < str.length() - 3; i++) {

            String word = str.substring(i, i + 4);
            if (!word.startsWith(".") && word.substring(1).equals("xyz")) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {


        System.out.println();
    }
}


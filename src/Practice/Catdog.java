package Practice;

public class Catdog {
    public static void main(String[] args) {



        String num1 = "cats";
        String num2 = "dog";


        int count = 0;
        int count2 = 0;
        boolean result = true;

        for (int i = 0; i < num1.length(); i++) {
           char ch=num1.charAt(i);
            System.out.println(ch);
        }
            for (int j = 0; j < num2.length(); j++) {
                count2 ++;
            }
            if (count == count2) {
                System.out.println(result);
            }else{
                System.out.println(false);
            }

    }
    }

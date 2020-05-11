package Replit;

public class Assessment_test_Appear_tw {
    public static void main(String[] args) {
        System.out.println("Hello world!");
  Boolean resul=  appearsTwice("java","java");
        System.out.println(resul);
    }

    /**
     * @param target - string that you need to check.
     * @param sentence - string where you need to lookup for target.
     * @return
     */
    public static boolean appearsTwice(String target, String sentence) {
        int count = 0;
        while(sentence.contains(target)) {
            sentence = sentence.replaceFirst(target,"");
            count++;
        }
        return (count==2) ? true : false ;
    }
}




/*
Instructions from your teacher:
Write a a method appearsTwice() that returns true if value of
 variable target appears only
twice in the string sentence, otherwise return false.



Examples:
Main.appearsTwice("java", "java is fun!") - returns false,
 because java appears only once.
Main.appearsTwice("laptop", "I would like to buy a new laptop,
because my laptop is too old.") - returns true, because laptop appears twice.
 */
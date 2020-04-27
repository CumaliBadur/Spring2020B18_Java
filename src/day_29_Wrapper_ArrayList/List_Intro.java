package day_29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {


        ArrayList<Integer> scores= new ArrayList<>();
        scores.add(10);
        scores.add(20);
        scores.add(30);
        System.out.println(scores);



        scores.get(2);

        Integer a1=scores.get(2);
        int a2=scores.get(2);
        double a3=scores.get(2);
        System.out.println(a2);
        System.out.println(scores.get(1));

    }
}

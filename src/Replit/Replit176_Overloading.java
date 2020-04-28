package Replit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Replit176_Overloading {

    public static void main(String[] args) {

        int[] news={10,20,30};


        System.out.println(findMax(news));


        double [] news1={50,100,500.};
        System.out.println(findMax(news1));
    }

    public static int findMax(int[] arr1){

        Arrays.sort(arr1);
           return arr1 [arr1.length-1];
    }
    public static double findMax(double[] arr1){


        Arrays.sort(arr1);
        return arr1 [arr1.length-1];
}
}


/*In this task, you need to write 2 methods findMax()
 that will find a maximum number in the array. First
 method should work with array of integers (int[]) and
  return int, and second method should work with an array of
   doubles (double[]) and return double as a result.

Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.*/
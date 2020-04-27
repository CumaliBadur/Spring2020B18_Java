package day_29_Wrapper_ArrayList;

import java.util.Arrays;

public class WrapperClass_Practice {


    public static void main(String[] args) {

        String [] arr2={"100","1","2.5","3","3.5","4.5","55"};


        double[] numbers=new double[arr2.length];
        for( int i=0;i<arr2.length;i++){
        numbers[i] = Double.parseDouble(arr2[i]);
}

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length-1]);


    }




}

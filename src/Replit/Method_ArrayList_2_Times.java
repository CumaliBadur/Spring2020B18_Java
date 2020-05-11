package Replit;
import java.util.ArrayList;
import java.util.Arrays;

public class Method_ArrayList_2_Times {
    public static void main(String[] args){

        ArrayList<Integer> mainn=new ArrayList<>();
        mainn.addAll(Arrays.asList(1,5,3,7));
        System.out.println(Arrays.asList(doubleetime(mainn)));

}

public static ArrayList<Integer> doubleetime(ArrayList<Integer> list){
    ArrayList<Integer> repeat = new ArrayList<>();
    for(Integer each : list){
        repeat.add(each);
    }
    int index = 0;
    for(Integer each1 : list){
        repeat.add(index, each1);
        index += 2;
    }
    return repeat;
}





    }
    //create your method below


/*
Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)*/

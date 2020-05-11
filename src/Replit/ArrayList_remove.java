package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_remove {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n)
    {
        r.removeAll(Arrays.asList(n));
        return r;

    }

    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>(Arrays.asList(1,1,2,3));
       // Integer[] nums = new Integer[]{1,1,2,3};
       // arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr,1));


    }//end main
}

/*
Instructions from your teacher:
This method gets an arraylist of Integers and a number(Integer).it returns an arraylist.

It removes any instance of the number it gets from the arraylist.

for example:

romoveInst([1,1,2,3,1,4],1)
returns: [2,3,4]

romoveInst([3,4,3,3],4)
returns: [3,3,3]


 */
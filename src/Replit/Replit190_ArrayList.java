package Replit;

import java.util.ArrayList;

public class Replit190_ArrayList {

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> num) {
        ArrayList<Integer> sum = new ArrayList();


















        for (Integer each : num) {
            if (each > 0) {
                sum.add(each);
            }
        }
        Integer sum2 = 0;
        for (Integer each2 : sum) {
            sum2 += each2;
        }
        sum.add(sum.size(), sum2);
        return sum;
    }
}









/*Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  The original ArrayList should remain unchanged.

 */
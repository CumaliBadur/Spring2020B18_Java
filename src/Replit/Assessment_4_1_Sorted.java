package Replit;

import java.util.Arrays;

public class Assessment_4_1_Sorted {

    public static void main(String[] args) {

int [] sort={2,5,5,4,9};


        //System.out.println(Arrays.toString(isSort(sort)));
    }

    public static boolean isSort(int[] nums) {
        int copy [] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            copy[i] = nums[i];
        }
        Arrays.sort(nums);
        int count = 0;
        for(int k=0; k<nums.length; k++){
            if(nums[k] == copy[k]){
                count++;
            }
        }
        return count == nums.length;
    }
}



/*
this is a sorted collection (in this case array):

7,8,9,10

this is an unsorted collection:

5,4,9,8,7,3

sorted in this case means smallest number to biggest.
isSort gets an array and returns true if its sorted.

for example:
isSort([2,3,5,4,9]);
returns: false

isSort([1,2,3]);
returns: true

isSort([7,8,9]);
returns: true.

 */
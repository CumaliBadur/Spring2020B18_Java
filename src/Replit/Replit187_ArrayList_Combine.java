package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit187_ArrayList_Combine {

    //create your method below
    public static ArrayList combineAL(ArrayList<String> wordList1 , ArrayList<String> wordList2){
        ArrayList<String>result=new ArrayList<>();







        for(int i=0;i<wordList1.size();i++){
            result.add(wordList1.get(i));
        }

        for(int i=0;i<wordList2.size();i++){
            result.add(wordList2.get(i));
        }

        return result;


    }

    public static void main(String[] args) {
        ArrayList<String>result1=new ArrayList<>();
        ArrayList<String>result2=new ArrayList<>();


        int []arr={9,8,100,150,25,56};
        System.out.println(maxNum(arr));

    }
    public static int maxNum(int[]arr){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    }


/*
Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, then add all the words (in order) from wordList2.  In other words, it is combining all the elements from the two parameters.
 */
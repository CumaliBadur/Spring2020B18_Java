package Replit;

import java.util.Arrays;

public class Replit_195_Method_Anagram {

    public static boolean isAnagram (String word1, String word2) {
        word1=word1.toLowerCase();
        word1=word1.trim();
        word2=word2.toLowerCase();
        word2=word2.trim();
        String [] arr1=word1.split("");
        String [] arr2=word2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }else{
            return false;

        }}

    public static void main(String[] args) {

        System.out.println(isAnagram("listen","silent"));





    }
}


/*
Anagram is a word, phrase, or name formed by rearranging
the letters of another, such as cinema, formed from iceman.

isAnagram method checks if word1 and word2 are anagram to
each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

isAnagram("java", "cava") ==> false*/






/*Anagram is a word, phrase, or name formed by rearranging the
 letters of another, such as cinema, formed from iceman.

isAnagram method checks if word1 and word2 are anagram
 to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

isAnagram("java", "cava") ==> false*/
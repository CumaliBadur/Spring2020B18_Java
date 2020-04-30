package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {
    public static void main(String[] args) {

ArrayList<Integer> list1= new ArrayList<>();


        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
/*
        boolean re1=list1.contains(10);
        boolean re2=list1.contains(20);
        boolean re3=list1.contains(40);
        boolean result= re1==true&& re2==true&& re3==true;
        System.out.println(result);*/


   boolean r4=     list1.containsAll(Arrays.asList(10,20,60));
        System.out.println(r4);













    }
}

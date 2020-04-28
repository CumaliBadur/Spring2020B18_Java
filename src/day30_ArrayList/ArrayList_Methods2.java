package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");



       //String str="B";
       // list.remove(str);
        boolean r1= list.remove("F");
        boolean r2= list.remove("A");
      //  list.remove(1);
        System.out.println(list);
        System.out.println(r1);
        System.out.println(r2);

list.clear();
        System.out.println(list);
        System.out.println(list.size());

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(6);

     int num=   list2.indexOf(6);
        System.out.println(num);

    }
}

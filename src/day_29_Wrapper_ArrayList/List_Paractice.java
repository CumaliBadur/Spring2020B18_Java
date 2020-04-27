package day_29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Paractice {
    public static void main(String[] args) {


        ArrayList<String > grocery= new ArrayList<>();

        grocery.add("Milk");
        grocery.add("Coffe");
        grocery.add("Balcan");
        grocery.add("Semik");
        grocery.add("Pepper");
        grocery.add("Gost");
        System.out.println(grocery);

        for(int i=0; i<grocery.size();i++){
            System.out.println(grocery.get(i));


        }
        int last=grocery.size()-1;
        System.out.println(last);
        System.out.println("===-=--=--=-=-=--=");

        for(String each:grocery){
            System.out.println(each);

        }

     int size=  grocery.size();

        System.out.println(size);



    }
}

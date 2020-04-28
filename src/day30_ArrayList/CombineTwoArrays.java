package day30_ArrayList;

import java.util.ArrayList;

public class CombineTwoArrays {
    public static void main(String[] args) {
        String[] arr1={"A","B","C"};
        String[] arr2={"C","D","F","G"};


        ArrayList<String> list=new ArrayList<>();

        for(int i=0; i<arr1.length;i++){
            String eachElement= arr1[i];
            list.add(eachElement);



        }
        for(String eachElement: arr2){
            list.add(eachElement);
        }


        System.out.println(list);











    }
}

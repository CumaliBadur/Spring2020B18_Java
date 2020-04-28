package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>();

        for(Integer each2:list){

            int count = 0;
            for (Integer each : list) {
                if (each == list.get(each)) {
                    count++;



        }


                if (count == 1) {
                    uniques.add(list.get(each2));

                }


            }



            }
        System.out.println(uniques);
        }


    }


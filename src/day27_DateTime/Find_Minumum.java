package day27_DateTime;

public class Find_Minumum {
    public static void main(String[] args) {

        int [] arr={5,4,7,5};
        double [] arr3={50.0,4.,7,5.0};
        int munumum=arr[0];

        for(int each: arr){
            if(each<munumum){
                munumum=each;
            }
        }
        System.out.println(minumumNum(arr));
       // System.out.println(munumum);
        System.out.println(  minumumNum(arr3));

    }

    public static int minumumNum(int [] arr){

        int munumum=arr[0];

        for(int each: arr){
            if(each<munumum){
                munumum=each;
            }
        }

        return munumum;
    }

    public static double minumumNum(double [] arr){
        double munumum=arr[0];


        for(double each: arr){

            if(each<munumum){
                munumum=each;
            }
        }

        return munumum;
    }
}

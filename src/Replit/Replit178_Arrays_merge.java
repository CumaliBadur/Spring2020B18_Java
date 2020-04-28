package Replit;

import java.util.Arrays;

public class Replit178_Arrays_merge {




 public static int[] mergR(int[] a,int[] b) {

   int[] arr=new int[a.length+b.length];

for(int i=0;i< a.length; i++){

    arr[i]=a[i];

    for( int j=0;j< b.length;j++){
        arr[j+a.length]=b[j];
    }
   }





return arr;
    }//end mergR

    public static void main(String[] args)
    {
int[] news=mergR(new int[] {1,2,3},new int[]{5,6,7});
        System.out.println(Arrays.toString(news));
    }
}

    //int[] merge= mergR(new int[]{1, 2, 3}, new int[]{4, 5, 6});
       // System.out.println(Arrays.toString(merge));





/*Instructions from your teacher:
mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current
element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.*/
package Replit;

public class Replit110_Each_Loop {

    public static void main(String[] args) {


        int eac=0;

        int [] arr=new int[31];
        for(int i=80; i>=20; i-=2){
            System.out.print(i+" ");
        //arr[(80-i)/2]=i;
        }
        for(int each:arr){
           // System.out.print(each+" ");
        }


    }
}
/*Instructions from your teacher:
Write a for loop that prints all the even
 integers from 80 through 20 inclusive, separated by spaces.

MUST USE FOR EACH LOOP*/
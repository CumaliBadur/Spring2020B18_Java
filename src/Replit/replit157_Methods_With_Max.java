package Replit;

public class replit157_Methods_With_Max {

    public static void main(String[] args) {

        int x=1;
        int y=5;
        max(x,y);

    }













    public static int max(int x,int  y){

        int result;
        if(x>y){
           result=y;
        }else{
         result=x;
        }
        System.out.println(result);
        return result;


    }












}
/*
Instructions from your teacher:
max function gets two ints, x and y.
x is the test case, y is what we test against.

if  x is bigger then y return y
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5
 */
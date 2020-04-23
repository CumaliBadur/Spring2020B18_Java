package Replit;

public class Replit158_Method_W_return {

    public static void main(String[] args) {

       int num= 2;
       isEven(num);

    }


    public static boolean isEven(int n){

boolean result;

if(n % 2==0) {
result=true;
} else{
  result= false;
    }
        System.out.println(result);
return result;





}


}







/*
Instructions from your teacher:
isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true

 */
package day35_Static;

public class staticMethods {

    int a=100;
static int b=200;
    public static void main(String[] args) {


        staticMethods obj= new staticMethods();
        System.out.println(obj.a);

        System.out.println("===========");

        System.out.println(b);
        System.out.println(staticMethods.b);
        System.out.println(obj.b);


    }

}

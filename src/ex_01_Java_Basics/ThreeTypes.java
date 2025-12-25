package ex_01_Java_Basics;

public class ThreeTypes {
    public static void main(String[] args) {

//        int a = 5;
//        int s= a++;
//
//        int b= 5;
//        int res = a+b;
//        int c = 5;
//        res = a+b+c;

        // Unary
        int num = 1;
        int positive = +num;

        // Increment
        int a = 5;
        int c =-a;
        //int b = ++a;
        int d = a++;
        //System.out.println("Bvale " + b);
        System.out.println("cvalue " + c);
        System.out.println("Dvalue" + d);
        //logical
        boolean status = true;
        // boolean notactive = status;
        System.out.println(positive);
        System.out.println(!status);





    }
}

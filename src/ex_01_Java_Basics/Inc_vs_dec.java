package ex_01_Java_Basics;

public class Inc_vs_dec {
    public static void main(String[] args) {

        int a = 5;
        int b = -5;

 //       int b = -5;
//        System.out.println(++a); //6
//        System.out.println(a++); //6
//        System.out.println(a); //7
//        System.out.println(++a); //8
//        System.out.println(a); //8

        System.out.println(a+=5); // a = a (5) + 5
        System.out.println(b+=5); // b = b (-5) + 5
        System.out.println(b); // 0
        System.out.println(b+= (-6)); // b = b (-5) + (-5)

        //BODMAS



    }
}

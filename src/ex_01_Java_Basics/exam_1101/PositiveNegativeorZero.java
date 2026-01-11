package ex_01_Java_Basics.exam_1101;

import java.util.Scanner;

public class PositiveNegativeorZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = sc.nextInt();
        String result = (a > 0) ? "Positive" : (a < 0) ? "Negative" : "Zero";
        System.out.println("The number is: " + result);
        sc.close();
//        if (a>0)
//        {
//            System.out.println("Positive number");
//        }
//        else if (a<0)
//        {
//            System.out.println("Negative number");
//        }
//        else
//        {
//            System.out.println("Number is Zero");
//        }
    }
}

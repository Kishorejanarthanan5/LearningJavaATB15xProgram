package ex_01_Java_Basics.exam_1101;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
         if (number % 2 == 0)
         {
             System.out.println("Its Even number");
         } else if (number % 2 == 1) {
             System.out.println("Its Odd number");
         } else {
             System.out.println("Enter Valid Number");
         }
    }
}

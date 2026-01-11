package ex_01_Java_Basics.exam_1101;

public class MaximumofTwoNumbers {
    public static void main(String[] args) {
        int a = 5; int b = 8;
        // System.out.println(Math.max(a,b));
        int max = (a > b) ? a : b;
        System.out.println("Maximum number is: " + max);

    }
}

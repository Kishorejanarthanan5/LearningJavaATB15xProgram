package ex_01_Java_Basics.exam_1101;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Make a choice: 1-Add, 2-Sub, 3- Multiple, 4-Division: ");
        int choice = sc.nextInt();
        System.out.println("Number1: ");
        int a = sc.nextInt();
        System.out.println("Number2: ");
        int b = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Add: " + (a + b));
                break;
            case 2:
                System.out.println("Sub: " + (a - b));
                break;
            case 3:
                System.out.println("Multiple: " + (a * b));
                break;
            case 4:
                System.out.println("Division: " + (a / b));
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
package ex_01_Java_Basics;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        // Marks > 50 it will pass || otherwise fail
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        // System.out.print("Enter the exam: ");
        double mark = scan.nextDouble();

        String result = mark >= 50 ? "Pass" : "Fail";
        System.out.println(result);
        scan.nextLine();
        System.out.println("Enter the exam: ");
        String exam = scan.next();
        // if mark >= 70 then A ; mark < 70 && > 50 then B ; <= 50 C

        char grade = mark >= 70 ? 'A' : (mark < 70 && mark > 50) ? 'B': 'C';
        System.out.println(grade);

        scan.close();

    }
}

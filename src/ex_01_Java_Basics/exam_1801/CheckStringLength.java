package ex_01_Java_Basics.exam_1801;

import java.util.Scanner;

public class CheckStringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int l = input.length();
        if(l>10)
        System.out.println("Given String is greater then 10 character");
        else
           System.out.println("Given String is less or equal to 10 character");
    }
}


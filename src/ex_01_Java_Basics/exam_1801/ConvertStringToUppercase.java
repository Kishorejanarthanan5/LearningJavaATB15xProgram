package ex_01_Java_Basics.exam_1801;

import java.util.Scanner;

public class ConvertStringToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toUpperCase();

        System.out.println("Upper case Converted:"+ input);


    }
}

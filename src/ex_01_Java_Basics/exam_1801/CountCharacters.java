package ex_01_Java_Basics.exam_1801;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int count = 0;
        for (int i =1; i < input.length(); i++)
        {
            if (input != " "){
            count++;
            }
        } System.out.println("Total number of character:" + count);
    }
}

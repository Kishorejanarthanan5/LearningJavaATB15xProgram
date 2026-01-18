package ex_01_Java_Basics.task;

import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        do {
            System.out.println("Enter a word to reverse: ");
            word = sc.nextLine();
        } while (word == null || word.isBlank());

        String reverse = "";
        for (int i= word.length()-1; i>=0; i --)
        {
            reverse = reverse + word.charAt(i);
        }
        System.out.println("Reversed word is: "+ reverse);
    }
}

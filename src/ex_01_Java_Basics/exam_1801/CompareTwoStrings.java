package ex_01_Java_Basics.exam_1801;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first string word: ");
        String word1 = scanner.nextLine();
        System.out.println("Enter a second string word: ");
        String word2 = scanner.nextLine();

        if(word1.equalsIgnoreCase(word2)){
            System.out.println("The given both words are matching");
        } else {
            System.out.println("The word is not matching");
        }
    }
}

package ex_01_Java_Basics.exam_1801;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        String reverse = "";
        for (int i = input.length()-1; i >= 0; i--){
            reverse = reverse + (input.charAt(i));
        }
        System.out.println("Reversed String: " + reverse);
    }
}

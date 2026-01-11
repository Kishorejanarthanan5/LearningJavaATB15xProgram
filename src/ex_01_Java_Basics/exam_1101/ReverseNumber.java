package ex_01_Java_Basics.exam_1101;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 34567;
        int digit;
        int reverse = 0;
        do {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        } while (number != 0);

        System.out.println("Reversed number: " + reverse);
    }
}

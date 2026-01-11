package ex_01_Java_Basics.exam_1101;

public class ContinueStatementExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}


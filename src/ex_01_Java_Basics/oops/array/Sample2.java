package ex_01_Java_Basics.oops.array;

public class Sample2 {
    public static void main(String[] args) {
        int[] number = new int[10];

// store values
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1 ;
        }

// print index (i) and value
        for (int i = 0; i < number.length; i++) {
            System.out.println("Index i = " + i + ", Value = " + number[i]);
        }

    }
}

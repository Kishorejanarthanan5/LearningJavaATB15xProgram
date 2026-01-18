package ex_01_Java_Basics.arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max1 = numbers[0];
        int max2 = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > max1){
                max2 = max1;
                max1 = numbers[i];
            }
            else if (numbers[i] > max2 && numbers[i] != max1) {
                max2 = numbers[i];
            }
        } System.out.println(max2);
    }
}

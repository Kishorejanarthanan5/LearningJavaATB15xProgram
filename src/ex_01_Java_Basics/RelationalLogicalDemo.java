package ex_01_Java_Basics;

public class RelationalLogicalDemo {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x != y);

        boolean result = (x < y) && (y > 15);
        System.out.println(result);
    }
}

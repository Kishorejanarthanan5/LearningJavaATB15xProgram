package ex_01_Java_Basics;

public class Thereemax {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = 12;
        int maxNumber = (n1>n2) ? n1:(n2>n3)? n2 :n3 ;
        System.out.println("MAX OUT OF THREE: "+ maxNumber);
    }
}

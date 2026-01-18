package ex_01_Java_Basics.oops;

public class Motorbikerunner {
    public static void main(String[] args) {
        Motorbike honda = new Motorbike();
        Motorbike bmw = new Motorbike();

        honda.start();
        bmw.start();

        honda.setSpeed(80);
        System.out.println(honda.getSpeed());
        bmw.setSpeed(150);
        System.out.println(bmw.getSpeed());


    }
}

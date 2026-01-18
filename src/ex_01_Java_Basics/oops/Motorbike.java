package ex_01_Java_Basics.oops;

public class Motorbike {
    //state
    private int speed; // member variable
    //behavior

    void setSpeed(int speed)
    {                          // local variable
        this.speed = speed;
    }
    int getSpeed()
    {
        return this.speed;
    }
    void start()
    {
        System.out.println("Bike started with speed: "+ speed);
    }

}

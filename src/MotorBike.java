public class MotorBike
{
    private int speed;
    static void start()
    {
        System.out.println("bike started");
    }
    public int getSpeed()
    {
        return speed;
    }
    MotorBike(String name,int speed)
    {
        this.speed=speed;
        System.out.printf("%s speed is %d",name,speed).println();
    }
    int incresespeed(int speed)
    {
        this.speed=this.speed+speed;
        System.out.println("speed increase by "+speed);
        return this.speed;
    }
}


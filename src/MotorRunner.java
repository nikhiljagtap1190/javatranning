public class MotorRunner
{
    public static void main(String args[])
    {

        MotorBike honda=new MotorBike("honda",110);
        MotorBike ducati=new MotorBike("ducati",90);
        honda.start();
        ducati.start();
        System.out.println(honda.getSpeed());
        System.out.println(ducati.getSpeed());
        System.out.println(honda.incresespeed(50));


    }
}


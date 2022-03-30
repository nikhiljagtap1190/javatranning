interface Flyable
{
    void fly();
    
}
class Bird implements Flyable
{
    public void fly()
    {
        System.out.println("bird fly with wings");
    }
}
class aeroplane implements Flyable
{
    @Override
    public void fly() 
    {
        System.out.println("Aeroplane fly with fuel");    
    }
}

public class FlyRunner
{
    public static void main(String[] args)
    {
        Flyable[] fly1={new Bird(),new aeroplane()};
        for(Flyable f:fly1) {
            f.fly();
        }
    }
}
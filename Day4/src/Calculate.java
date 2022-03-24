
public class Calculate
{
    private int a,b;

    Calculate(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int add()
    {
        return(a+b);
    }
    public int mul()
    {
        this.a=a;
        this.b=b;
        return(a*b);
    }
    public void double1()
    {
        System.out.println("double value a is="+(a*2));
        System.out.println("double vale b is="+(b*2));
    }

}



class MethodOver
{
    static void sum()
    {
        int a=5,b=6;
        int sum=a+b;
        System.out.printf("sum=%d",sum).println();
    }
    static int sum(int a,int b)
    {
        int sum=a+b;
        return (sum);
    }
    public static void main(String[] args)
    {
        int c;
        sum();
        c=sum(10,5);
        System.out.printf("sum=%d",c).println();
    }
}
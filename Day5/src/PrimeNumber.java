public class PrimeNumber
{
    private int number;
    PrimeNumber(int number)
    {
        this.number=number;
    }
    public boolean getPrime()
    {
        for(int i=2;i<=(number-1);i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
     return true;
    }
    public int addition()
    {
        int sum=0;
        for(int i=1;i<=number;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
   public int division()
    {
        int sum=0;
       for(int i=2;i<=number-1;i++)
       {
           if(number%i==0)
           {
               sum=sum+i;

           }
       }
        return sum;
    }
    public static void getPattern(int number)
    {
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}


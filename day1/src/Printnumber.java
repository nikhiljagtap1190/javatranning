class Printnumber
{
    static void pNumber(int n)
    {
        System.out.printf("number",n).println();
        for(int i=1;i<=n;i++)
        {
            System.out.printf("%d",i).println();

        }
    }
    public static void main(String args[])
    {
        pNumber(8);
    }
}
public class Whileloop
{
   int limit;
    public Whileloop(int limit)
    {
        this.limit=limit;
    }

    public void getSquare()
    {
        int i=1;
        while (i * i <=this.limit)
        {
            System.out.println(i*i);
            i++;
        }
    }
    public void getCubes()
    {
        int i=1;
        while (i * i *i<=this.limit)
        {
            System.out.println(i*i*i);
            i++;
        }
    }
}

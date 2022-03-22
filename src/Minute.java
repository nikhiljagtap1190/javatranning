class Minute
{
   static void minute()
    {
        int h=24,m=60;
        System.out.printf("totol minute in a day=%d",h*m).println();

    }
    static void second()
    {
        int h=24,m=60,s=60;
        System.out.printf("total number of seconds in a day=%d", h * m * s).println();
    }

    public static void main(String args[])
    {
        minute();
        second();
    }
}
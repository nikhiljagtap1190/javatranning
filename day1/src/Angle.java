class Angle
{
    static int angCalculation(int ang1,int ang2)
    {
     int ang3;
     ang3=180-(ang1+ang2);
     return (ang3);

    }

    public static void main(String args[])
    {
        int ang=angCalculation(45,90);
        System.out.printf("3rd angle=%d",ang).println();
    }
}
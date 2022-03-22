class Comparision
{
    public static void main(String args[])
    {
        int ang1=45,ang2=60,ang3=75;
        System.out.printf("1st angle=%d 2nd angle=%d 3rd angle=%d",ang1,ang2,ang3).println();
        if((ang1+ang2+ang3)==180)
        {
            System.out.println("three angle can form a triangle");
        }
        else
        {
            System.out.println("Three angle can not form triangle");
        }
    }
}
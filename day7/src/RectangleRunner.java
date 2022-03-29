import java.util.Scanner;

public class RectangleRunner
{
    public static void main(String[] args)
    {
        Rectangle rect=new Rectangle();
        float number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rectangle length");
        number=scanner.nextFloat();
        rect.length=number;
        System.out.println("Enter the rectangle breath");
        number=scanner.nextFloat();
        rect.breadth=number;
        System.out.println("Area of Reactangle is="+rect.rectangleArea());
    }
}

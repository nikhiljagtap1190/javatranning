import java.util.Scanner;

public class WhileLoopRunner
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        Whileloop loop=new Whileloop(number);
        System.out.println("Square=");
        loop.getSquare();
        System.out.println("Cubes=");
        loop.getCubes();
    }
}

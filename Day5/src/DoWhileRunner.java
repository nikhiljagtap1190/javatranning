import java.util.Scanner;

public class DoWhileRunner
{
    public static void main(String[] args)
    {
        int number;
        do
        {
            System.out.println("Enter the number");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            if(number>=0)
            {
                System.out.println(number * number * number);
            }
        }while(number>=0);
        System.out.println("thank you ! have fun !");
    }
}

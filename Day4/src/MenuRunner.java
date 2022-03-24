import java.util.Scanner;

public class MenuRunner
{
    public static void main(String[] args)
    {
        int number1,number2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number=");
        number1= scanner.nextInt();
        System.out.println("Enter the second number=");
        number2= scanner.nextInt();
        System.out.println("enter your choice---------------");
        System.out.println("1. Addition\n" +
                           "2. Substarction\n"+
                           "3. Multiplication\n"+
                           "4. Division");
        int choice=scanner.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Addition="+(number1+number2));
                break;
            case 2:
                System.out.println("Substraction="+(number1-number2));
                break;
            case 3:
                System.out.println("multiplication="+(number1*number2));
                break;
            case 4:
                System.out.println("Division="+(number1/number2));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

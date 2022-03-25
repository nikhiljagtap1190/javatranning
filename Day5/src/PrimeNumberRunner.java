import java.util.Scanner;

public class PrimeNumberRunner
{
    public static void main(String[] args)
    {
        int number1;
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        number1= scanner.nextInt();
        PrimeNumber prime=new PrimeNumber(number1);
        System.out.println(prime.getPrime());
      //  System.out.println("enter for pattern");
       // int number2= scanner.nextInt();
        System.out.println("Addition="+prime.addition());
        System.out.println("sum of divisional number is ="+prime.division());
        prime.getPattern(number1);

    }
}

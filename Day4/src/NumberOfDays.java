import java.util.Scanner;

public class NumberOfDays
{
    public static void main(String[] args)
    {
        int number;
        System.out.println("enter the number");
        Scanner sacnner=new Scanner(System.in);
        number= sacnner.nextInt();
        switch (number) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid choice");
        }
        }
}


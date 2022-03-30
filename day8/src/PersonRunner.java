import java.util.Scanner;

public class PersonRunner
{
    public static void main(String[] args)
    {
        Employee emp=new Employee();
        Scanner scanner=new Scanner(System.in);
        Scanner sa=new Scanner(System.in);
        System.out.println("enter the employee name");
        emp.name=scanner.nextLine();
        System.out.println("enter email id");
        emp.email= sa.nextLine();
        Scanner p=new Scanner(System.in);
        System.out.println("enter phone number");
        emp.pho= p.nextLine();
        System.out.println("enter designation ");
        Scanner sc1=new Scanner(System.in);
        emp.tital= sc1.nextLine();
        System.out.println("enter company name");
        emp.compy_name= sa.nextLine();
        System.out.println("enter grade");
        emp.grade= p.nextLine();
        System.out.println("enter salary");
        emp.salary= p.nextFloat();
        System.out.println(emp);




    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayRunner
{
    public static void main(String[] args)
    {
        StudentArray student= new StudentArray("Rama",new int[]{95,56,95,98,78});
        student.getMarks();

        student.addMarks(23);
        System.out.println("new array is=");
        student.getMarks();
        System.out.println("Enter the index for remove element from array=");
        Scanner scanner=new Scanner(System.in);
        int index= scanner.nextInt();
        student.removeMarks(index);
        student.getMarks();

    }
}

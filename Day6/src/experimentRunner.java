import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class experimentRunner
{
    public static void main(String[] args)
    {
        String name;
        ArrayList<Integer> marks=new ArrayList<Integer>();
        System.out.println("Enter the name");
        Scanner scanner=new Scanner(System.in);
        name=scanner.nextLine();
        System.out.println("enter marks");
        for(int i = 0; i < 5; i++)
        {
            int num = scanner.nextInt();
            marks.add(num);
        }
        Experiment exp1=new Experiment(name,marks);
        exp1.getValue();
    }

}

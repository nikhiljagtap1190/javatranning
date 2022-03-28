import java.util.ArrayList;

public class Experiment
{
    private String name;
    ArrayList<Integer> marks=new ArrayList<Integer>();
    Experiment(String name,ArrayList<Integer> marks)
    {
        this.name= name;
        this.marks=marks;

    }

     public void getValue()
    {
       for(int i=0;i<5;i++)
       {
           System.out.println(this.marks.get(i));
       }
    }
}

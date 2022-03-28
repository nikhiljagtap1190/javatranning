import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student<marks>
{

    private String name;
    private int[] marks;
    public Student(String name,int[] marks)
    {
        this.name = name;
        this.marks = marks;
    }
    public int getNumberOfMarks()
    {
        return marks.length;
    }
    public int getSumMarks()
    {
        int sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
        }
        return sum;
    }
    public int getMaximum()
    {
        int max=0;
        for(int i=0;i<marks.length;i++)
        {
            if(max<marks[i])
            {
                max=marks[i];
            }
        }
        return max;
    }
    public int getMinimum()
    {
        int min=marks[0];
        for(int i=0;i<marks.length;i++)
        {
            if(min>marks[i])
            {
                min=marks[i];
            }
        }
        return min;
    }
    public BigDecimal getAverage()
    {
       int number=getNumberOfMarks();
       int sum=getSumMarks();
       return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }
}

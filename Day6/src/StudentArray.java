 import java.util.ArrayList;

public class StudentArray
{
    private String name;
    private ArrayList<Integer> marks=new ArrayList<Integer>();
    StudentArray (String name, int... marks)
    {
        this.name=name;

        for(int mark:marks)
        {
            this.marks.add(mark);
        }

    }

    public void getMarks()
    {
        for(int i=0;i<this.marks.size();i++)
        {
            System.out.println(this.marks.get(i));
        }
    }
    public void addMarks(int marks)
    {
        this.marks.add(marks);

    }
    public void removeMarks(int index)
    {
        this.marks.remove(index);
    }
}

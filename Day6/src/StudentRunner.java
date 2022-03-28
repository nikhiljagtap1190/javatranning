public class StudentRunner
{
    public static void main(String[] args)
    {

        Student student=new Student("Ranga",new int[] {95,96,87,98,99});
        System.out.println("Number of marks="+student.getNumberOfMarks());
        System.out.println("sum of mark="+student.getSumMarks());
        System.out.println("maximum mark="+student.getMaximum());
        System.out.println("minimum mark="+student.getMinimum());
        System.out.println("average of mark="+student.getAverage());
    }
}

import java.util.List;

public class FunctionalNumber
{
    public static void main(String[] args)
    {
        List<Integer> list=List.of(23,10,5,89,78,43,56,12);
        for(int value:list)
        {
            System.out.println(value);
        }
        printBasic(list);
        printFP(list);
    }

    private static void printBasic(List<Integer> list)
    {
        System.out.println("Even Element is");
        for(int number:list)
        {
            if(number%2==0)
            {
                System.out.println(number);
            }
        }
    }
    private static void printFP(List<Integer> list)
    {
        System.out.println("------------FINCTIONAL OPERATION--------------");
        list.stream().forEach(e-> System.out.println("Number="+e));
        int sum=list.stream().reduce(0 ,(number1,number2)->
               {
                   System.out.println(number1 + " " + number2);
                   return number1 + number2;
               });
        System.out.println("Addition="+sum);
        System.out.println("sorted");
        list.stream().sorted().forEach(e-> System.out.println(e));
        System.out.println("Distinct");
        list.stream().distinct().forEach(e-> System.out.println(e));
        list.stream().sorted().distinct().forEach(e-> System.out.println(e));
        System.out.println("Even Number using functional");
        list.stream().filter(e->e%2==0).forEach(e-> System.out.println(e));
        System.out.println("ODD Number using functional");
        list.stream().filter(e->e%2==1).forEach(e-> System.out.println(e));
        System.out.println("Square of number");
        list.stream().map(e->e*e).forEach(e-> System.out.println(e));
        System.out.println("Square of Even number");
        list.stream().filter(e->e%2==0).map(e->e*e).forEach(e-> System.out.println(e));

    }


}

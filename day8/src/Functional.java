
import java.util.List;
import java.util.Locale;


public class Functional
{
    public static void main(String[] args)
    {
        List<String> list = List.of("Apple", "Cat", "Dog", "Elephant");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        printBasic(list);
        printWithFP(list);
    }

    private static void printBasic(List<String> list)
    {

        for(String str:list)
        {
            if(str.endsWith("at"))
            {
                System.out.println(str);
            }
        }
    }

    private static void printWithFP(List<String> list)
    {
        System.out.println("---------------FUNCTIONAL OPERATION-------------");
        list.stream().forEach(element-> System.out.println("Element="+element));
        list.stream().filter(element->element.endsWith("at")).forEach(element-> System.out.println("Element="+element));
        list.stream().map(s->s.toLowerCase()).forEach(p-> System.out.println(p));
        list.stream().map(s->s.toUpperCase()).forEach(p-> System.out.println(p));
        list.stream().map(s->s.length()).forEach(p-> System.out.println(p));
    }
}

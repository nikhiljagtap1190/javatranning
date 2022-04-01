import java.util.ArrayList;

public class GenericRunner
{
    public static void main(String[] args)
    {
        MyCustomList<String> list=new MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        list.addElement("Element 3");
        list.addElement("Element 4");
        list.removeElement("Element 1");
        String values=list.get(0);
        System.out.println(values);
        System.out.println(list);
        MyCustomList<Integer> list2=new MyCustomList<>();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(7));
        System.out.println(list2);

    }
}

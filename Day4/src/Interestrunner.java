import java.math.BigDecimal;

public class Interestrunner
{
    public static void main(String[] args)
    {
        Simpleinterest cal = new Simpleinterest("4522.50", "7.5");
        BigDecimal totalvalue = cal.calculator(5);
        System.out.println("simple interest="+totalvalue);
    }
}
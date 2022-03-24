import java.math.BigDecimal;

public class Simpleinterest
{
    BigDecimal principal;
    BigDecimal interest,noofyear,total;
    Simpleinterest(String principal,String interest)
    {
        this.principal= new BigDecimal(principal);
        this.interest= new BigDecimal(interest).divide(new BigDecimal(100));
    }
    public BigDecimal calculator(int noofyear)
    {
        BigDecimal noofyearB=new BigDecimal(noofyear);
        BigDecimal totalvalue=principal.add(principal.multiply(interest).multiply(noofyearB));
        return totalvalue;
    }

}

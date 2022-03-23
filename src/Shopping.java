public class Shopping
{
    public static void main(String args[])
    {
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();
        cust1.login("Rahul", "nagpur");
        Cart c1=new Cart();
        c1.add("shoes");
        Product pro1=new Product();
        pro1.order("shoes",499);
    }
}

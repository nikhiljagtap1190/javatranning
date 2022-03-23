public class MyFevBook
{
    private String bookname,authoer;
    private int bookprice;

    MyFevBook(String bookname, String authoer, int bookprice)
    {
        this.bookname = bookname;
        this.authoer = authoer;
        this.bookprice = bookprice;

    }

    public String getBookname()
    {
        return bookname;

    }


    public int getBookprice()
    {
        return bookprice;
    }

    public void setBookPrice(int bookprice)
    {
        this.bookprice = bookprice;
        System.out.println("price changes "+getBookprice()+getBookname());
    }
}

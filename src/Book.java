public class Book
  {
      public static void main(String args[])
      {
          MyFevBook b1=new MyFevBook("half girlfriend","chetan bhagat",500);
          MyFevBook b2=new MyFevBook("three man in boat","jerome",600);
          MyFevBook b3=new MyFevBook("animal farm","george",900);
          b1.setBookPrice(400);
          System.out.println(b1.getBookname()+b1.getBookprice());
          System.out.println(b2.getBookname()+b2.getBookprice());
          System.out.println(b3.getBookname()+b3.getBookprice());


      }
  }

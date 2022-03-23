public class Customer
{
  String name,address;
   public void login(String name,String address)
    {
       this.name=name;
       this.address=address;
        System.out.printf("%s login successfully",name).println();
     }
     public void logout()
     {
        System.out.printf("%s logout successfully",name).println();
        System.out.println("thank you for visiting");

      }

}

//  import day3.Customer;
   public class Product
   {
       String pname;
       int quantity=5,price;
        public void order(String pname,int price)
       {
           this.quantity=quantity;
           this.price=price;
           if(quantity>0)
           {
               System.out.printf("your placed order is %s and price is %d",pname,price).println();
               System.out.println("congratulation your conform");
               quantity--;
               System.out.println("Available quantity is "+quantity);

           }
           else
           {
               System.out.println("sorry out of stock");
           }
       }
       public void changePrice()
       {
           System.out.println("Price change");
       }
   }

import java.util.Scanner;

public class BookRunner
{
    public static void main(String[] args)
    {
        int id;
        String author;
        Scanner scanner=new Scanner(System.in);
        Scanner sa=new Scanner(System.in);
        System.out.println("Enter the book id");
            id = scanner.nextInt();
            System.out.println("Enter book name");
            String name = sa.nextLine();
            System.out.println("Enter author");
            author = sa.nextLine();
            Book book = new Book(id, name, author);
             System.out.println("Enter no of reviews");
            int no = scanner.nextInt();
             for(int i=1;i<=no;i++)
             {
            System.out.println("Enter book id");
            id = scanner.nextInt();
            System.out.println("enter review description ");
            String des = sa.nextLine();
            System.out.println("enter rating");
            int r = scanner.nextInt();
            book.addReview(new Review(id, des, r));
            }
            System.out.println(book);

    }
}

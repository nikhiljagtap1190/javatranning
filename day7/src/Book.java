import java.lang.module.FindException;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;

public class Book
{
    private int book_id;
    private String name;
    private String author;
    private ArrayList<Review> review=new ArrayList<>();
    public Book(int book_id,String name,String author)
    {
        this.book_id=book_id;
        this.name=name;
        this.author=author;
    }
    public void addReview(Review review)
    {
        this.review.add(review);
    }
    public String toString()
    {
        return String.format("id=%d name=%s auther=%s review=[%s]",book_id,name,author,review);
    }

}

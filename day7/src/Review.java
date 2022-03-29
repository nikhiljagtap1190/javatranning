public class Review
{
    private int book_id;
    private String description;
    private int rating;
    public Review(int book_id,String description,int rating)
    {
        this.book_id=book_id;
        this.description=description;
        this.rating=rating;
    }
    public String toString()
    {

        return book_id+" "+description+" "+rating;
    }
}

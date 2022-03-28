public class WeekDay
{
    private String[] day;
    WeekDay(String... day)
    {
        this.day=day;
    }
    public int getLength()
    {
        return day.length;
    }
    public String noOfLetters()
    {
        String noofcharecter="";
        for(String d1:this.day)
        {
            if(d1.length()>noofcharecter.length())
            {
                noofcharecter=d1;
            }
        }
        return noofcharecter;
    }

}

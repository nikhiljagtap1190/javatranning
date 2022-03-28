import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class WeekDaysRunner
{
    public static void main(String[] args)
    {
        String[] day = {"SUNDAY","MUNDAY","TUESDAY","WEDNESDAY","THUSDAY","FRIDAY","SATURDAY"};
        WeekDay day1=new WeekDay(day);
        System.out.println("length of the days are="+day1.getLength());
        String day2=day1.noOfLetters();
        System.out.println(day2);
    }
}

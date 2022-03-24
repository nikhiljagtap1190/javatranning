public class MyChar
{
    private char ch;
    MyChar(char ch)
    {
        this.ch=ch;
    }
    public boolean isVowel()
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isDigit()
    {
        if (ch >=48 && ch <=57)
        {
            return true;
        } else
        {
            return false;
        }
    }
    public boolean isUppercaseAlphabet()
    {
        if(ch>=65 && ch<=90)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isLowercaseAlphabet()
    {
        if(ch>=97 && ch<=122)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

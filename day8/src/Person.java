public class Person
{
    String name;
    String email;
    String pho;
    public void setPvalue(String name,String email,String pho)
    {
        this.name=name;
        this.email=email;
        this.pho=pho;
    }

}
class Employee extends Person
{
    String tital;
    String compy_name;
    String grade;
    float salary;
    public void setvalue(String tital,String compy_name,String grade,float salary)
    {
        this.tital=tital;
        this.compy_name=compy_name;
        this.grade=grade;
        this.salary=salary;
    }
    public String toString()

    {
        return (" Name="+name+"\n Email="+email+"\n Phone number="+pho+"\n Tital="+tital+"\n Company name= "+compy_name+"\n Grade= "+grade+"\n Salary "+salary);
    }
}

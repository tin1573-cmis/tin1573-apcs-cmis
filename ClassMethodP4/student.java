public class student
{
    private double GPA;
    private String grade="";
    private String fname;
    private String lname;

    public student(String fname, String lname)
    {
        this.fname=fname;
        this.lname=lname;
        this.grade=grade;
    }


    public double getGPA()
    {
        return GPA;
    }

    public void setGPA(double GPA)
    {
        this.GPA=GPA;
        if(GPA >= 4)
        {
            grade="A";
        }
        else if (GPA >= 3)
        {
            grade="B";
        }
        else if (GPA >= 2)
        {
            grade="C";
        }
        else if (GPA >= 1)
        {
            grade="D";
        }
        else
        {
            grade="F";
        }
    }

   

    public String toString()
    {
        String output =
            String.format(
                "first name: %s\n" +
                "last name: %s\n" +
                "avgGPA: %.2f\n" +
                "grade: %s" , 
                fname, lname, GPA, grade);

        return output;

    }//toString
}  //instant variable 


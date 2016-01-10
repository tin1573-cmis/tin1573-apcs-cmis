public class student
{
    private double english;
    private double math;
    private double science;
    private double fineArts;
    private double socialScience;
    private double[] grade = new double [5];

    private String fname;
    private String lname;
    public student()
    {
        for (int i=0; i < grade.length; i++)
        {
            grade[i]=0.0;
        }
        lname = "s";
        fname = "ss";
    }//contructor
    public student(String fname, String lname, double english, double math, double science, double fineArts, double socialScience)
    {

        grade[0]=english;
        grade[1]=math;
        grade[2]=science;
        grade[3]=fineArts;
        grade[4]=socialScience;
        this.fname=fname;
        this.lname=lname;

    }

    public void setGPA(double english, double math, double science, double fineArts, double socialScience)
    {
        this.grade[0]=english;
        this.grade[1]=math;
        this.grade[2]=science;
        this.grade[3]=fineArts;
        this.grade[4]=socialScience;
    }
    double GPA = 0;
    public double calcGPA()
    {
        double GPA = 0;
        for (int i=0; i< gra de.length; i++)
        {

            GPA += grade[i];
        }

        return GPA;

    }
    String gradeL;
    public void setGPA()
    {

        if(calcGPA()/grade.length >= 4)
        {
            gradeL="A";
        }
        else if (calcGPA()/grade.length >= 3)
        {
            gradeL="B";
        }
        else if (calcGPA()/grade.length >= 2)
        {
            gradeL="C";
        }
        else if (calcGPA()/grade.length >= 1)
        {
            gradeL="D";
        }
        else
        {
            gradeL="F";
        }
    }

    public String toString()
    {
        String output =
            String.format(
                "first name: %s\n" +
                "last name: %s\n" +
                "letter grade: %s\n" +
                "avg GPA- %.2f\n" +
                "  %.2f" + 
                "  %.2f" +
                "  %.2f"+ 
                "  %.2f" +
                "  %.2f", 
                fname, lname,gradeL, calcGPA()/grade.length,grade[0], grade[1], grade[2], grade[3],grade[4]);

        return output;

    }//toString
}  //instant variable 

 
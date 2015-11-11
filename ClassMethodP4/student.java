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

    public double getEnglish()
    {
        return english;
    }
    public double getMath()
    {
        return math;
    }
    public double getScience()
    {
        return science;
    }
    public double getfineArts()
    {
        return fineArts;
    }
    public double getsocialScience()
    {
        return socialScience;
    }
    
    
    public void setEnglish(double eng)
    {
        this.english=eng;
    }
    public void setMath(double mat)
    {
        this.math=mat;
    }
    public void setScience(double sci)
    {
        this.science=sci;
    }
    public void setfineArts(double fA)
    {
        this.fineArts=fA;
    }
    public void setsocialScience(double sS)
    {
        this.socialScience=sS;
    }

    
    public double calcGPA()
    {
        double GPA = 0;
        for (int i=0; i< grade.length; i++)
        {

            GPA += grade[i];
        }
        return GPA/grade.length;

    }

    public String toString()
    {
        String output =
            String.format(
                "first name: %s\n" +
                "last name: %s\n" +
                "avg GPA- %.2f\n", 
                fname, lname,calcGPA());

        return output;

    }//toString
}  //instant variable 

 
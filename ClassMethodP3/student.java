public class student
{
    private double english;
    private double math;
    private double science;
    private double fineArts;
    private double socialScience;
    private double GPA=0.0;
    
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
        for (int i=0; i < grade.length; i++)
        {
            grade[0]=this.english;
            grade[1]=this.math;
            grade[2]=this.science;
            grade[3]=this.fineArts;
            grade[4]=this.socialScience;
            this.fname=fname;
            this.lname=lname;
        }
    }

    public double calcGPA()
    {

        for (int i=0; i> grade.length; i++)
        {

            GPA+= grade[i];
        }
        return GPA;
    }

    public String toString()
    {
        String output =
        String.format(
            "first name: %s\n" +
            "last name: %s\n" +
            "avg GPA- %.2f\n", 
            fname, lname,GPA);

        return output;

    }//toString
}  //instant variable 

 
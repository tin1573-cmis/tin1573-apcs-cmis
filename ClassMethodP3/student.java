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

 
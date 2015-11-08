public class student
{
    private double english;
    private double math;
    private double science;
    private double fineArts;
    private double socialScience;
    private double GPA;
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
    public student(double english, double math, double science, double fineArts, double socialScience)
    {
        for (int i=0; i < grade.length; i++)
        {
            grade[i]=this.english;
            grade[i]=this.math;
            grade[i]=this.science;
            grade[i]=this.fineArts;
            grade[i]=this.socialScience;

        }
    }

    public int calcGPA(int GPA)
    {
        for (int i=0; i> grade.length; i++)
        {

            //GPA=GPA + grade[i];
        }
        return GPA/grade.length;
    }

    public String toString()
    {
        String output = new String();
        String.format(
            "first name: %s\n" +
            "last name: %s\n" +
            "english %f\n" + 
            "math %f\n" + 
            "science %f\n" + 
            "gineArts %f\n" + 
            "social science %f\n" +
            "avg GPA- %f\n", 
            fname, lname, english, math, science, fineArts, socialScience);

        return output;

    }//toString
}  //instant variable 

 
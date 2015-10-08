public class student
{
    private String fname;
    private String lname;
    private int age;
    private double height;

    public student()
    {
        fname = "Anchalee";
        lname = "Tantiviramanond";
        age = 17;
        height = 1.67;

    }//contructor

    public student(String fname, String lname, int age, double height )
    {
        this.fname = fname;
        this.lname = lname;   
        this.age = age;
        this.height = height;

    }//constructor

    public String toString()
    {
        String output = new String();
        output = lname + " , " + fname + " is " + age + " years old and is " + height + " meters tall."; 

        return output;

    }//toString
}  //instant variable 

 
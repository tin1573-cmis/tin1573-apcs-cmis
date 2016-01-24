public class Student
{
    private int age;
    private double gpa;
    private String name;
    public Student( int age, double gpa, String name)
    {
        this.age=age;
        this.gpa=gpa;
        this.name=name;

    }
    public double getGPA()
    {
        return gpa;
    }
    public String toString()
    {
        String result = String.format( 
        "age: %d\n" +
        "gpa: %.2f\n" +
        "name: %s\n" ,
        age, gpa, name);
       
        return result;
    }
}

public class Doctor extends Person
{
    private String degree;
    
    public Doctor(String name, int yob, int mob, int dob, String degree)
    {
        super(name, yob, mob, dob);
        this.degree = degree;
    }
    
        
    public String toString()
    {
        return super.toString() + String.format("\nPhD: %s", degree);
    }
    
}
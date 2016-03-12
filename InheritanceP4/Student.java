public abstract class Student
{
    private String firstName;
    private String Major;
    private int unitsTaken;

    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }

    public void setMajor(String newMajor)
    {
        Major = newMajor;
    }

    public void setUnitsTaken(int newUnitsTaken)
    {
        unitsTaken = newUnitsTaken;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getMajor()
    {
        return Major;
    }

    public int getUnitsTaken()
    {
        return unitsTaken;
    }

    abstract public int calculateTuition(int units);

    public String toString()
    {
        String output= String.format
            ("Fname-%s \t" +
                "Major-%s \t"+
                "UnitsTaken-%d \t",
                firstName, Major, unitsTaken);

        return output;
    }
   

} // end abstract class SuperHero

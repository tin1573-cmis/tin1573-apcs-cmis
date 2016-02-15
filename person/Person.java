import java.time.LocalDate;
public class Person
{
    private String name;
    private LocalDate birthDate;
    
    public Person(String name, int yob, int mob, int dob)
    {
        this.name = name;
        this.birthDate = LocalDate.of(yob, mob, dob);
    }

    public String toString()
    {
        return String.format("Name: %s\nDOB: %s", name, birthDate);
    }

}

public class PersonApp
{
    public static void main(String[] args)
    {
        Person[] people = new Person[2];
        people[0] = new Person("Nathan Kieffer", 1975, 4, 23);
        people[1] = new Doctor("Stephen King", 2001, 6, 18, "Applied Physics");
      
        for ( Person person : people )
        {
            System.out.println(person + "\n");
        }     
    }
}
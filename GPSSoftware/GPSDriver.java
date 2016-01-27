
public class GPSDriver
{
    public static void main (String args[])
    {
        Roster2 student = new Roster2();
        System.out.println(student);
        student.addStudent(new Student(12, 1.0, "low")	);
        System.out.println(student);
        student.dropStudent("lew");
        System.out.println(student);
    }
}

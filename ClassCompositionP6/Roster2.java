import java.util.ArrayList;
public class Roster2
{
    private ArrayList<Student> StudentList= new ArrayList<Student>();
    public Roster2()
    {
        StudentList.add(new Student(10, 4.0, "lew"));
        StudentList.add(new Student(11, 3.0, "law"));
        StudentList.add(new Student(13, 2.0, "liw"));

    }

    public void addStudent ( Student newStudent )
    {
        StudentList.add(newStudent);
    }

    public void dropStudent ( String name ) 
    {
        for(int i=0; i<StudentList.size(); i++)
        {
            if(StudentList.get(i).getName().equals(name))
            {
                StudentList.remove(StudentList.get(i));
            }
        }

    }

    public String toString()
    {
        String output = "";
        for (Student Student : StudentList)
        {
            output+= Student;
        }
        return output;

    }//toString
}

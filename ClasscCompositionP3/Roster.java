
public class Roster
{
    private Student[] StudentList;
    public Roster()
    {
        this.StudentList= new Student[3];
        StudentList[0] = new Student( 12, 3, "a" );
        StudentList[1] = new Student( 11, 4, "b" );
        StudentList[2] = new Student( 10, 2, "c" );
    }

    public double studWithMaxGPA()
    {
        double most=0;
        for (int i=0; i<StudentList.length; i++)
        {
            if (StudentList[i].getGPA()>most)
            {
                most = StudentList[i].getGPA();
            }
        }
        return most;
    }

    public String toString()
    {
        String output = String.format( 
                "MAX GPA: " + studWithMaxGPA()
            ); 
        for (Student Student : StudentList)
        {
            System.out.println(Student);
        }
        return output;

    }//toString
}

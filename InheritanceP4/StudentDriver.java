import java.util.ArrayList;
public class StudentDriver
{
    public static void main (String args[])
    {
        UnderGrad p1 = new UnderGrad( );
        p1.setFirstName("p1");
        p1.setMajor( "English" );
        p1.setUnitsTaken( 1 );

        UnderGrad p2 = new UnderGrad( );
        p2.setFirstName("p2");
        p2.setMajor( "Spanish" );
        p2.setUnitsTaken( 2 );

        Graduate p3 = new Graduate( );
        p3.setFirstName("p3");
        p3.setMajor( "Mexican" );
        p3.setUnitsTaken( 3 );

        Graduate p4 = new Graduate( );
        p4.setFirstName("p4");
        p4.setMajor( "Italian" );
        p4.setUnitsTaken( 4 );

        PostGrad p5 = new PostGrad( );
        p5.setFirstName("p5");
        p5.setMajor( "Japan" );
        p5.setUnitsTaken( 5 );

        PostGrad p6 = new PostGrad( );
        p6.setFirstName("p6");
        p6.setMajor( "China" );
        p6.setUnitsTaken( 6 );

        ArrayList<Student> studentBody = new ArrayList<Student>();
        studentBody.add(p1);
        studentBody.add(p2);
        studentBody.add(p3);
        studentBody.add(p4);
        studentBody.add(p5);
        studentBody.add(p6);

        Student[][] studentList = new Student[3][2];
        int i=0;
          for (int r=0; r<studentList.length;r++ )
            {
                for (int c=0; c<studentList[0].length; c++)
                {
                    studentList[r][c]= studentBody.get(i);
                    i++;
                }
            }
        
        for (Student[] row : studentList )
        {
            for (Student num : row)
            {
                System.out.print( num + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        for (Student student : studentBody )
        {
            System.out.println(student);
        }
    }
}
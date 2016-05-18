import java.util.ArrayList;
public class test
{
    public static void main (String args[])
    {   
        ArrayList students = new ArrayList(String);
        students.add("s");
        students.add("sa");
        students.add("sss");
        for (int i = 0; i < students.size(); i++)
        {
            System.out.print(students.set(i, "s")+ " ");
        }
        for (String str: students)
        {
            String.ot.print(str + " ");
        }    
    }
}

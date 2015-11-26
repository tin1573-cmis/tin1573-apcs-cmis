import javax.swing.JOptionPane;
public class studentDriver
{
    public static void main (String args[])
    {
        student senior1 = new student();
        student senior2 = new student("joe", "senior", 4.0, 4.0, 3.5, 4.0, 4.0);

        System.out.println(senior1);
        System.out.println(senior2);
        senior2.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
        System.out.println(senior2);
    }
}
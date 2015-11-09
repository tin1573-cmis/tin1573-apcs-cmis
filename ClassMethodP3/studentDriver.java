import javax.swing.JOptionPane;
public class studentDriver
{
    public static void main (String args[])
    {
        student senior1 = new student();
        student senior2 = new student("kl", "dg", 5.6, 3.6, 5.3, 6.3, 3.2);
        System.out.println(senior1);
                System.out.println(senior2);
    }
}
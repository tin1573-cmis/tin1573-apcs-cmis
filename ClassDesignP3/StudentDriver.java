import javax.swing.JOptionPane;
public class studentDriver
{
    public static void main (String args[])
    {
        student junior001 = new student("Chanipa", "Sanphet", 20 , 1.80 );
        student senior001 = new student();

        JOptionPane.showMessageDialog ( null, senior001, "CMIS Student" ,JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog ( null, junior001, "CMIS Student" ,JOptionPane.PLAIN_MESSAGE );
    }
}
import javax.swing.JOptionPane;
public class studentDriver
{
    public static void main (String args[])
    {

        
        student senior2 = new student("joe", "senior");
        senior2.setGPA(4.0);   
        
        student senior1 = new student( "junior", "sdsd");
        senior1.setGPA(3.00);  

        
        System.out.println(senior2);

        
        System.out.println(senior1);

    }
}
import javax.swing.JOptionPane;
public class ComputerDriver
{
    public static void main (String args[])
    {
        computer com1 = new computer("Alienware", true , 9.1 );
        computer com2 = new computer();

        System.out.println(com1);
        System.out.println(com2);
        
    }
}
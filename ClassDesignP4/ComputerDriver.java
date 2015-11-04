import javax.swing.JOptionPane;
public class ComputerDriver
{
    public static void main (String args[])
    {
        Computer com1 = new Computer("Alienware", true , 9.1 );
        Computer com2 = new Computer();

        System.out.println(com1);
        System.out.println(com2);
        
    }
}
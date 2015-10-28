import javax.swing.JOptionPane;
public class blackJackDriver
{
    public static void main (String args[])
    {
        blackJack com1 = new computer("Alienware", true , 9.1 );
        blackJack com2 = new computer();

        System.out.println(com1);
        System.out.println(com2);
        
    }
}
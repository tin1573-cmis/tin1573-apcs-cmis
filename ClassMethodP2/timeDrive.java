import javax.swing.JOptionPane;
public class timeDrive
{
    public static void main (String args[])
    {
        time clock= new time();
        clock.convertToSec();
        System.out.println(clock);
        clock.setTime(22,33,11 );
        System.out.println(clock);
        //clock.setTime(dls);
        System.out.println(clock);
    }
}
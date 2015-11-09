import javax.swing.JOptionPane;
public class timeDrive
{
    public static void main (String args[])
    {
        time clock= new time();
        clock.convertToSec();
        System.out.println(clock);

        clock.setTime(2,33,11 );
        clock.convertToSec();
        System.out.println(clock);

        clock.convertDLS(1);
        clock.convertToSec();
        System.out.println(clock);
    }
}
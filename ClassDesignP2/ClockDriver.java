import javax.swing.JOptionPane;
public class ClockDriver
{
    public static void main (String args[])
    {
        int hr = Integer.parseInt(JOptionPane.showInputDialog("Type an integer: "));
        int min = Integer.parseInt(JOptionPane.showInputDialog("Type an integer: "));
        int sec = Integer.parseInt(JOptionPane.showInputDialog("Type an integer: "));
        MyClock BedroomClock = new MyClock(hr,min,sec);
        MyClock KitchenClock = new MyClock();

        System.out.println ( KitchenClock );
        System.out.println ( BedroomClock );
    }
}
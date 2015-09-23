import javax.swing.JOptionPane;
public class WeatherChaos
{
    public static void main ( String args[] )
    {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Type an integer: "));
        int[] temp= new int[input];
        System.out.print("day" + "\t" + "temp"+ "\t" + "swing" + "\t" + "description");
        String output="";
        if( input < 32 && input > 0)
        {
            int i = 0;
            while(  i < temp.length )
            {
                temp[i] =((int)(200*Math.random())-100);
                i++;
            }//end while
        }//end if
        else
        {
            System.out.print("That is not a valid number of days");
        }
    } // end main
} // end NAME
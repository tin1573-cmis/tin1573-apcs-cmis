
import javax.swing.JOptionPane;
public class Test1 
{
    public static void main ( String args[] )
    {
        String input1 = JOptionPane.showInputDialog("Choose an integer");
        int num = Integer.parseInt( input1 );
        double[] array = new double[num];
        for( int index = 0; index < array.length; index++ )
        {
            array[index] =((100*Math.random()));

        }
        for( int index = 0; index < array.length; index++ )
        {
            array[index] =((100*Math.random()));

            System.out.println(index + ": " + array[index]);
        }
        int x = 0;
        for( int index = 0; index < array.length; index++ )
        {
            x = (int)array[index];

            if (array[index]%2==0)
            {
 
                for (int i = 0; i > x; i++)
                {
                    System.out.print("E");
                } 

            }
            else 
            {
                for (int i = 0; i < x; i++)
                {
                    System.out.print("O");
                } 
            }
        }
        for( int index = array.length-1; index >= 0; index-- )
        {

            System.out.println(index + ": " +array[index]);
        }
    } // end main
} // end Test1
// If I had 10 more minutes I could have finished it like this. 
import javax.swing.JOptionPane;
public class TestOneFinishedAfterClass
{
    public static void main ( String args[] )
    {
        String input1 = JOptionPane.showInputDialog("Choose an integer");
        int num = Integer.parseInt( input1 );
        double[] array = new double[num];
        for( int index = 0; index < array.length; index++ )
        {
            array[index] =((50*Math.random()));

        }
        for( int index = 0; index < array.length; index++ )
        {
            array[index] =((50*Math.random()));

            System.out.println(index + ": " + array[index]);
        }
        int x = 0;
        for( int index = array.length -1 ; index >= 0 ; index-- )
        {

            x = (int)array[index];
           System.out.print(index + ": ");
            if (x%2==0)
            {

                for (int i = 0; i < x; i++)
                {
                    System.out.print( "E");
                } 

            }
            if (x%2==1)
            {
                for (int i = 0; i < x; i++)
                {
                    System.out.print( "O");
                } 
            }
            System.out.println(array[index]);
        }
        
    } // end main
} // end Test1
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
            array[index] =((51*Math.random()));
            System.out.println(index + ": " + array[index]);
        }//end for
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
                } //end for
            }// end if
            else
            {
                for (int i = 0; i < x; i++)
                {
                    System.out.print( "O");
                } //end for
            }// end if
            System.out.println(" " + array[index]);
        }//end for
    } // end main
} // end Test1
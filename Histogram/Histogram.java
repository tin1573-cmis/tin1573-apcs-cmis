import javax.swing.JOptionPane;
public class Histogram 
{
    public static void main ( String args[] )
    {
        String input = JOptionPane.showInputDialog( "Choose an integer");
        int num = Integer.parseInt( input );
        String []count = new String[100];
        int []info = new int[num];
        int sum= 0;
        int min = 99;
        int max = 0;
        for ( int index = 0; index < info.length; index++ )
        {
            info[index] =((int)(100*Math.random())); 
            sum = sum + info[index];

        }
        for ( int index = 0; index < 100; index++  )
        {

            for ( int i = 0; i < 100; i++  )
            {
                if (index == count[i])
                {
                    
                }
            }

        }

        for ( int index = 0; index < info.length; index++ )
        {
            System.out.print(count[index]);
        }

        for ( int index = 0; index < info.length; index++ )
        {
            if ( info[index] < min)
            {
                min=info[index];
            }

        }
        for ( int index = 0; index < info.length; index++ )
        {
            if ( info[index] > max)
            {
                max=info[index];
            }

        }
        System.out.println( "Min: " + min );
        System.out.println( "Max: " + max );
        System.out.println( "Sum: " + sum );
        System.out.println( "Average: " + sum / num);

    } // end main
} // end NAME
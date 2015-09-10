import javax.swing.JOptionPane;
public class TestOnePartner
{
    public static void main ( String args[] )
    {
        String input1 = JOptionPane.showInputDialog("Choose an integer");
        int number = Integer.parseInt(input1);
        double []num = new double[number];

        for ( int index = 0; index < num.length; index++ )
        {
            num[index] = Math.random()*51;
            System.out.println(index + ": " + num[index]);
        }

        for ( int index = num.length-1; index >= 0; index-- )
        {
            if (num[index] % 2 == 0)
            {
                for (int x = 0; x < (int)array[index]; x++ )
            }
            else
            {
               for (int x = 0; x < (int)array[index]; x++ )
            }
        }
        } // end main
    } // end Test1
/**
 * User input password with specifications. 
 * @T1N
 * @beta
 */
import javax.swing.JOptionPane;
public class Password
{
    public static void main ( String args[] )
    {
        int cnt = 0;
        String input = JOptionPane.showInputDialog( "Create a password? With length " + 
                "of at least 6 characters and at least one non-alphanumeric character (+, -, *, /, or @)");

        for (int i=0; i<input.length(); i++)
        {
            
            if (input.substring(i).equals("+")|| input.substring(i).equals("-")|| input.substring(i).equals("*")|| input.substring(i).equals("/")|| input.substring(i).equals("") )
            {
                cnt += 1;       
            }

        }
        if ( input.length()<6 || cnt==0)
        {
            System.out.println("reject");
        }
    }    
}


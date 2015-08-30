import javax.swing.JOptionPane;
public class FundamentalsP9
{
    public static void main ( String args[] )
    {
        String user = JOptionPane.showInputDialog( "What is your user name?");
        String num = JOptionPane.showInputDialog( "What is your password?");
        int pass = Integer.parseInt( num );
        if (user.equals("hahahahaha"))
        {
            if (pass == (123456789))
            {
                System.out.println ( "You have successfully logged in." );
            }
            else
            {
                System.out.println ( "Your username and password does not match." );
            }
        }
        else
        {
            System.out.println ( "Your username is not recognised, try again." );
        }
    } // end main
} // end FundamentalsP9
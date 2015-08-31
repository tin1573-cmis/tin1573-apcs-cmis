import javax.swing.JOptionPane;
public class FundamentalsP9
{
    public static void main ( String args[] )
    {
        String user = JOptionPane.showInputDialog( "What is your user name?");
        String num = JOptionPane.showInputDialog( "What is your password?");
        int pass = Integer.parseInt( num );
        if (user.equals("hahahahaha") && pass == (123456789))
        {
            System.out.println ( "You are now logged in." );
        }
        else
        {
            System.out.println ( "Your username or password is incorrect, please try again." );
        }
    } // end main
} // end FundamentalsP9
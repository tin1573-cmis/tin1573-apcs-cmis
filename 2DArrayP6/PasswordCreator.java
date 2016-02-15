import javax.swing.JOptionPane;
public class PasswordCreator
{
    public static void main(String [] args)
    {
        String name = JOptionPane.showInputDialog("name-");
        String password = JOptionPane.showInputDialog("password-");
        int i = 0;
        String lowercaseName= name.toLowerCase();
        String lowercasePassword=password.toLowerCase();

        while ( i>=0 )
        {
            i = lowercasePassword.indexOf (lowercaseName);
            if (i>=0)
            {
                System.out.println("Fail");
                lowercasePassword = JOptionPane.showInputDialog("password-").toLowerCase();
            }
            else 
            {
                System.out.println("Success"); 
            }
        }
    }
}
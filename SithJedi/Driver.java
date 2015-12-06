import javax.swing.JOptionPane;
public class Driver
{
    public static void main (String args[])
    {
        String fname = JOptionPane.showInputDialog( "What is your first name?");
        String lname = JOptionPane.showInputDialog( "What is your last name?");
        String type = JOptionPane.showInputDialog( "What is your favorite animal?");
        String side = JOptionPane.showInputDialog( "Who is your idol?");
        String lightSaber = JOptionPane.showInputDialog( "What is your favorite colour?");
        String forcePower = JOptionPane.showInputDialog( "Are you emotionally, physically or mentally appealing?");
        
        
        SithJedi you= new SithJedi();
        System.out.println(you);

    }
}
// fname, lname AND side- length determine name
// fave animal- determines type
//idol - determine sith or jedi
//fave colour AND side - light saber colour
//force power AND side - jedi/sith power
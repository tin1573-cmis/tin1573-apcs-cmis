import javax.swing.JOptionPane;
public class Movies 
{
    public static void main ( String args[] )
    {
        int input = Integer.parseInt(JOptionPane.showInputDialog("How many movies do you want us to pick from: "));
        String[] movieNames= new String[input];
        for (int i=0; i<input;i++)
        {
            movieNames[i] = JOptionPane.showInputDialog( "Movie name " + (i+1));  
        }
        System.out.println("You shall watch ... " + movieNames[(int)(Math.random()*input)]);
    }
}
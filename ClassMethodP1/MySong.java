import javax.swing.JOptionPane;
public class MySong
{

    private String SongName;
    private double SongLength;
    private int ReleaseYear;
    String mins = "";
    String user = JOptionPane.showInputDialog( "What is your user name?");
    int pass = Integer.parseInt(JOptionPane.showInputDialog( "What is your password?"));

    public MySong()
    {
        SongName = new String( "PennyLane" );
        SongLength = 343;
        ReleaseYear = 1969;
    }

    public int getReleaseYear()
    {

        return ReleaseYear;

    }

    public void setReleaseYear(int year)
    {
        if (user.equals("t") && pass == (1))
        {
            this.ReleaseYear=year;
        }
    }

    public String convertToSecond()
    {
        mins = (int)(SongLength/60) + "." + (int)(SongLength%60);
        return mins;
    }

    public String toString()
    {
        String output = new String();
        output = "Name of Song is " + SongName + "\n" +
        "The song's length is " + SongLength + "\n" +
        "Year of Release is " + ReleaseYear;
        return output;

    }
}   

 
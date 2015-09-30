public class Song1
{
    private String SongName;
    private double SongLength;
    private int ReleaseYear;

    public Song1()
    {
        SongName = new String( "PennyLane" );
        SongLength = 3.03;
        ReleaseYear = 1967;
    }
    public Song2(String SongName, double SongLength, int ReleaseYear)
    {
        this.SongName = new String(SongName);
        this.SongLength = SongLength;
        this.ReleaseYear = ReleaseYear;
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

 
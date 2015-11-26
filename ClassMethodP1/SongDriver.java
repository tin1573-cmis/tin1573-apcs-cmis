public class SongDriver
{
    public static void main (String args[])
    {
        MySong Song1 = new MySong();       
        System.out.println ( Song1 );
        Song1.setReleaseYear(1967);

        System.out.println ( Song1 );
        System.out.println ( "Song length in mins is " + Song1.convertToSecond() );
    }
}
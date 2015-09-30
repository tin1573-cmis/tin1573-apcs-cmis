public class SongDriver
{
    public static void main (String args[])
    {
        MySong OtherSong = new MySong();
        MySong Song = new MySong("Lucy in the Sky with Diamonds", 3.28, 1967 );

        System.out.println ( Song );
        System.out.println ( OtherSong );
    }
}
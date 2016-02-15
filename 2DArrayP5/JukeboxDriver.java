
public class JukeboxDriver
{
    public static void main ( String args[] )
    {
        Jukebox one = new Jukebox();
        System.out.println(one);
        System.out.println(one.randomSong()); 
        System.out.println(one.playRating(2));
    }
}

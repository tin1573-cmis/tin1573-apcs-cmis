public class SongDriver
{
    public static void main (String args[])
    {
        MySong Song2 = new MySong();
        MySong Song1 = new MySong("Lucy in the Sky with Diamonds", 3.28, 1967 );

        System.out.println ( Song1 );
        System.out.println ( Song2 );
    }
}
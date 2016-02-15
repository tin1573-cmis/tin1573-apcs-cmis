public class Song
{
    private String name;
    private int ratings;
    public Song( String name, int ratings)
    {

        this.name=name;
        this.ratings=ratings;


    }

    public int getRating()
    {
        return ratings;
    }

    public String toString()
    {
        String result = String.format( 
                "name: %s\n" +
                "rating: %d\n" 
            ,
                name, ratings);

        return result;
    }
}
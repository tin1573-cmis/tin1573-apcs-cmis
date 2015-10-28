public class blackJack
{
    private String brand;
    private boolean gaming;
    private double rating;

    public blackJack()
    {
        

    }//contructor

    public blackJack( )
    {
        this.brand = brand;
        this.gaming = gaming;   
        this.rating = rating;
    }//constructor

    public String toString()
    {
        String output = new String();
        output = brand + " is good for gaming: " + gaming + ". " + brand + " has an average rating of " + rating ; 

        return output;

    }//toString
}  //instant variable 

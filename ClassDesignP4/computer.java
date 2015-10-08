public class computer
{
    private String brand;
    private boolean gaming;
    private double rating;

    public computer()
    {
        brand = "Mac";
        gaming = false;
        rating = 7.9;

    }//contructor

    public computer(String brand, boolean gaming, double rating )
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

 
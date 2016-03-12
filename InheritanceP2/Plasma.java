public class Plasma extends Television
{
    private String model;
    private double price;
    
    public Plasma()
    {
        this.model = "Plasma Sapphire";
        this.price = 599.00;
    }
 
    public Plasma(String model, double price)
    {
        this.model = model;
        this.price = price;
    }
   
    public String toString()
    {
        String output = new String("");
        output = "The Model of this tv is: " + this.model +"\tPrice: " + this.price;
        return output;
    }
}

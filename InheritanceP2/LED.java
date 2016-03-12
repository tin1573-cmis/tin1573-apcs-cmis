public class LED extends Television
{
    private String model;
    private double price;

    public LED()
    {
        this.model = "LED Platinum";
        this.price = 317.99;
    }

    public LED(String model, double price)
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
public class Car extends Vehicle 
{
    private int mpg;
    private double luck;
    
    public Car(int milesPerGallon)
    {
        this.mpg = milesPerGallon;
    }

    public Car(int passengers, int milesPerGallon)
    {
        super(passengers);
        this.mpg = milesPerGallon;
    }

    public void connectToBluetooth()
    {
        System.out.println("Connecting to bluetooth, Car");
    }

    public String canDiscount()
    {
        luck = Math.random();
        if( luck > 0.5)
        {
            return "Discounted";
        }
        else
        {
            return "Full price";
        }
    }

    public String toString()
    {
        return super.toString() + "\n" +
        "Milers per gallon for this car is: " + mpg;
    }
}
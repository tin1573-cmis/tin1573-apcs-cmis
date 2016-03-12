public abstract class Vehicle implements Connectables, Discountable
{
    private int numPassengers;
    public Vehicle()
    {
        this.numPassengers = 0;

    }

    public Vehicle(int passengers)
    {
        this.numPassengers = passengers;
    }

    public abstract void connectToBluetooth();
    
    public abstract String canDiscount();

    public String toString()
    {
        return "Number of passengers is: " + numPassengers;
    }
}
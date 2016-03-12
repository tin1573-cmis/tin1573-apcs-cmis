public class Phone extends Device
{
    private String carrier;
    
    public Phone()
    {
        super();
        this.carrier = new String("AIS");
    }
 
    public Phone(int memory, String color, String carrier)
    {
        super(memory, color);
        this.carrier = carrier;
    }
   
     public void connectToBluetooth()
    {
       System.out.println("Connecting to bluetooth, phone");
    }
    
    public String toString()
    {
        String output = new String("");
        output = super.toString() + 
        "\nCarrier: " + carrier;
        return output;
    }
}
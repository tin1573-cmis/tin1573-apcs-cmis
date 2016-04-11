public class HermesSportBoot extends MyDevice
{
    private int feetSize;
   
    

    public HermesSportBoot()
    {
        super();
        this.feetSize = 12;
    }

    public HermesSportBoot(int memory, String color, int feetSize)
    {
        super(memory, color);
        this.feetSize = feetSize;

    }

    public void setFeetSize(int num)
    {
        this.feetSize = num;
    }

    public int getFeetSize()
    {
        return feetSize;   
    }
    
    
    public String toString()
    {
        String output = new String("");
        output = super.toString() + 
        "\nSize of feet: " + feetSize;
        return output;
    }
}
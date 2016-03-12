public abstract class Device implements Connectables
{
    private int memory;
    private String color;
    
    public Device()
    {
        this.memory = 8;
        this.color = new String("Black");
    }
 
    public Device(int memory, String color)
    {
        this.memory = memory;
        this.color = color;

    }
   
    public String toString()
    {
        String output = new String("");
        output = "Memory: " + memory + 
        "\nColor: " + color;
        return output;
    }
}
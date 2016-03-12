public class MyHatScreen extends MyDevice
{
    private int headSize;
    private int screenSize;
    

    public MyHatScreen()
    {
        super();
        this.headSize = 12;//in inches
        this.screenSize = 4; // in inches
    }

    public MyHatScreen(int memory, String color, int headSize, int screenSize)
    {
        super(memory, color);
        this.headSize = headSize;
        this.screenSize = screenSize;
    }

    public void setHeadSize(int num)
    {
        this.headSize = num;
    }

    public int getHeadSize()
    {
        return headSize;   
    }
    
     public void setScreenSize(int num)
    {
        this.screenSize = num;
    }

    public int getScreenSize()
    {
        return screenSize;   
    }

    public String toString()
    {
        String output = new String("");
        output = super.toString() + 
        "\nSize of head: " + headSize +
        "\nSize of screen: " + screenSize;;
        return output;
    }
}
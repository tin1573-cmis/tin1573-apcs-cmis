public class MyPod extends MyDevice
{

    public MyPod()
    {
        super();

    }

    public MyPod(int memory, String color)
    {
        super(memory, color);

    }

    public String toString()
    {
        String output = new String("");
        output = super.toString() ;

        return output;
    }
}
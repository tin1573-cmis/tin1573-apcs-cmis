public class UnderGrad extends Student
{
    public UnderGrad()
    {
        super();
    }
    public int calculateTuition(int units)
    {
        int price = units * 250;
        return price;
    }
    public String toString()
    {
        return "UnderGrad-" + super.toString()
                ;
    }
}

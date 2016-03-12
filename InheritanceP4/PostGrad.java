public class PostGrad extends Student
{
    public PostGrad ()
    {
        super();
    }
    
   public int calculateTuition(int units)
    {
        int price = units * 750;
        return price;
    }
    public String toString()
    {
        return "PostGrad-" + super.toString() ;
    }
}

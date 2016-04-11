public class Graduate extends Student
{
    public Graduate()
    {
        super();
    }
    
    public int calculateTuition(int units)
    {
        int price = units * 500;
        return price;
    }
    
     public String toString()
    {
        return "Graduate-" + super.toString() ;
    }
}

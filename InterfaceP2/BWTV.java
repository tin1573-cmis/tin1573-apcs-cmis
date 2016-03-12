public class BWTV extends TV implements Analog
{
    
    public BWTV()
    {
        super();
    }
    
    public String configureAntenna()
    {
        return "Antenna Configured";
    }

    public String tvType()
    {
        return "I'm a black and white TV";
    }
}
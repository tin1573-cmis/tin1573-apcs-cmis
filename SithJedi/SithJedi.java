public class SithJedi
{
    private String lightSaber;
    private String forcePower;
    private String fname;
    private String lname;
    private String side;
    private String type;

    public void setTime(String lightSaber, String forcePower, String fname, String lname, String side, String type)
    {
        this.lightSaber=lightSaber;
        this.forcePower=forcePower;
        this.fname=fname;
        this.lname=lname;
        this.side=side;
        this.type=type;
    }

    public String toString()
    {
        String result = String.format( 
                "Name: %s %s\n" +
                "Type: %s\n" +
                "Side: %s\n"  + 
                "Light Saber Colour: %s\n"  +
                "Force Power: %s\n" 
            , fname ,lname ,type, side, lightSaber, forcePower ); 

        return result;

    }//toString
}
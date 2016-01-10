public class SithJedi
{

    private String lightSaber;
    private String forcePower;
    private String fname;
    private String lname;
    private String side;
    private String type;

    public SithJedi(String lightSaber, String forcePower, String fname, String lname, String side)
    {
        this.lightSaber=lightSaber;
        this.forcePower=forcePower;
        this.fname=fname;
        this.lname=lname;
        this.side=side;
        this.type=type;
    }

    public String calcSide()
    {
        if (side.equals("einstein"))
        {
            side="Jedi";
        }
        else 
        {
            side="Sith";
        }
        return side;
    }

    public String calcName()
    {

        if( side.equals("Sith" ))
        {
            if (fname.length()<5)
            {
                fname="a";
            }
            if (fname.length()>=5)
            {
                fname="Darth";
            }
            if( lname.length()<5)
            {
                lname=" Fett";
            }
            if( lname.length()>=5)
            {
                lname=" b";
            }
        }
        else
        {
            if (fname.length()<5)
            {
                fname ="c";
            }
            if (fname.length()>=5)
            {
                fname ="d";
            }
            if( lname.length()<5)
            {
                lname =" e";
            }
            if ( lname.length()>=5)
            {
                lname =" f";
            }
        }
        String name = fname + " " + lname;
        return name;
    }

    public String calcColour()
    {
        if( side.equals("Jedi" ))
        {
            if (lightSaber.equals("red"))
            {
                lightSaber="green";
            }
            if (lightSaber.equals(""))
            {
                lightSaber="blue";
            }
        }
        else
        {
            if (lightSaber.equals("red"))
            {
                lightSaber="red";
            }
            if (lightSaber.equals(""))
            {
                lightSaber="purple";
            }
        }
        return lightSaber;
    }

    public String calcPower()
    {
        if(forcePower.equals("emotionally"))
        {

        }
        else if(forcePower.equals("physically"))
        {

        }
        else
        {
            forcePower="force choke";
        }
        return forcePower;
    }

    public String toString()
    {
        String result = String.format( 
                "Name: %s \n" +
                "Side: %s\n"  + 
                "Light Saber Colour: %s\n"  +
                "Force Power: %s\n" 
            , calcName() , calcSide(), calcColour(), calcPower() ); 

        return result;

    }//toString
}
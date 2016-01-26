public class ClockStore
{
    private clock[] clocksInStock ;

    public ClockStore()
    {
        this.clocksInStock= new clock[3];
        clocksInStock[0] = new clock( 12, 30, 45 );
        clocksInStock[1] = new clock( 11, 32, 42 );
        clocksInStock[2] = new clock( 10, 34, 41 );
    }

    public int mostSecs()
    {
        int most=0;
        for (int i=0; i<clocksInStock.length; i++)
        {
            if (clocksInStock[i].convertToSec()>most)
            {
                most = clocksInStock[i].convertToSec();
            }
        }
        return most;
    }

    public String toString()
    {
        String output = String.format( 
                "most second: " + mostSecs()
            ); 
        for (clock clock : clocksInStock)
        {
            output+= "\n" + clock ;
        }
        return output;

    }//toString
}
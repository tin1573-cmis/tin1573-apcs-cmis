public class ClockStore
{
    private clock[] clocksInStock ;

    public ClockStore()
    {
        this.clocksInStock= new clock[3];
        clocksInStock[0] = new clock( 133, 30, 45 );
        clocksInStock[1] = new clock( 1366, 32, 42 );
        clocksInStock[2] = new clock( 1, 34, 41 );
    }

    public int mostSecs()
    {
        int most=0;
        int max=0;
        for (int i=0; i<clocksInStock.length; i++)
        {
            if (clocksInStock[i].convertToSec()>most)
            {
               most = clocksInStock[i].convertToSec();
               max=i+1;
            }
        }
        return max;
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
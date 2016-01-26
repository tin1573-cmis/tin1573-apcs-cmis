public class clock
{
    private int hr;
    private int sec;
    private int min;
    private int secs;

    public clock(int hr, int min, int sec)
    {
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }

    public int convertToSec ()
    {
        secs = (hr*3600) + (min*60) + sec   ;   
        return secs;
    }

    public String toString()
    {
        String result = String.format( 
                "hr: %d\n" +
                "min: %d\n" +
                "sec: %d\n" , hr ,min ,sec); 

        return result;

    }//toString
}
public class time
{
    private int hr;
    private int sec;
    private int min;
    private int secs;
    public time()
    {
        hr=2;
        min=1;
        sec=1;
        
    }

    public void setTime(int hr, int min, int sec)
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

    public int convertDLS(int hrs)
    {
        hr=hrs+hr;
        return hr;
    }

    public String toString()
    {
        String result = String.format( 
                "hr: %d\n" +
                "min: %d\n" +
                "sec: %d\n"  + 
                "Seconds Only:  %d", hr ,min ,sec, secs); 

        return result;

    }//toString
}
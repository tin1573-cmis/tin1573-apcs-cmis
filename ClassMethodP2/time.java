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
        secs=secs;
    }

    public void setTime(int hr, int min, int sec)
    {
        this.hr=hr;
        this.min=min;
        this.sec=sec;
        this.secs=secs;
    }

    public int convertToSec ()
    {
        secs = (hr*3600) + (min*60) + sec   ;   
        return secs;
    }

    public int convertDLS()
    {
        if (hr>=12)
        {
            hr = hr+1;  
        }
        else 
        {
            hr=hr-1;
        }
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
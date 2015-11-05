public class time
{
    private int hr;
    private int sec;
    private int min;
    private int dls; 
    private int secs;
    public time()
    {
        hr=11;
        min=22;
        sec=33;
    }
    public void setTime (int hr, int min, int sec)
    {
        this.hr= hr;
        this.min=min;
        this.sec=sec;
           
    }
    public int convertDLS(int dls)
    {
        if (hr>=12)
        {
            dls = hr+1;
            
        }
        else 
       {
        dls=hr-1;
        }
        return dls;
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
        "sec: %d\n"  + 
        "Seconds Only:  %d", hr ,min ,sec, secs); 

        return result;

    }//toString
}
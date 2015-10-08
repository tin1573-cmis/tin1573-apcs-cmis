public class MyClock
{
    private int hr;
    private int min;
    private int sec;

    public MyClock()
    {
        hr = 15;
        sec = 30;
        min = 59;

    }//contructor

    public MyClock(int hr, int min, int sec )
    {
        this.hr = hr;
        this.min = min;   
        this.sec = sec;

    }//constructor

    public String toString()
    {
        String output = new String();
        output ="The time is " + String.format("%02d", hr) + ":" +
                 String.format("%02d", min) + ":" + String.format("%02d", sec);

        return output;

    }//toString
}  //instant variable 

 
import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)

    {
        BWTV TV1 = new BWTV();
        HDMI  TV2 = new HDMI();
        ArrayList<TV> TV = new ArrayList<TV>();
        TV.add( TV1);
        TV.add( TV2);
        
        for(TV oneTV: TV)
        {
            System.out.println(oneTV.tvType() + ": On? " + oneTV.turnTvOn() );
        }
        
        for(int i = 0; i < TV.size(); i++)
        {
            TV.get(i).setTv(true);
        }
        
        
        for(TV oneTV: TV)
        {
            System.out.println(oneTV.tvType() + ": On? " + oneTV.turnTvOn() );
        }
        
        System.out.println(TV1.configureAntenna());
        System.out.println(TV2.connectHDMI());
        
        
      
    }
}
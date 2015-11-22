import javax.swing.JOptionPane;
public class Euler4 
{
    public static void main ( String args[] )
    {
        String[] nums = new String[10000];
        String num;
        int output;
        for (int cnt=0; cnt<nums.length; cnt++)
        {
            for(int i=99; i<=999; i++)
            {
                for(int e=99; e<=999; e++)
                {
                    num = Integer.toString(i*e) ;
                    if (num.substring(0,1).equals(num.substring(num.length()-1,num.length())))
                    {
                        if (num.substring(1,2).equals(num.substring(num.length()-2,num.length()-1)))
                        {
                            if (num.substring(2,3).equals(num.substring(num.length()-3,num.length()-2)))
                            {
                                nums[i]=num;
                            }
                        }
                    }
                }
            }
        }
    }
}
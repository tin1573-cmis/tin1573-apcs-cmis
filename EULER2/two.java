
public class two
{
    public static void main(String args[]) 
    {
        int[] num = new int[40];
        int x=1;
        int y=0;
        for (int i = 2; (num[i]=num[i-1]+num[i-2])< 4000000; i++)
        {
            num[0]=1;
            num[1]=2;
            num[i]=num[i-1]+num[i-2];

            if (num[1]%2==0)
            {
                y+=num[i];
            }
            
        }
                    System.out.println(y);
    }
}
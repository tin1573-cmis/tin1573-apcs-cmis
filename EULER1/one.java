
public class one
{
    public static void main(String args[]) {
        int x =1000;
        int y=0;
        for (int i=0; i<x; i++)
        {
            if (i%3==0)
            {   
                y+=i  ; 
            }
        }
         for (int i=0; i<x; i++)
        {
            if (i%5==0)
            {   
                y+=i  ; 
            }
        }
        System.out.println(y);
    }
}

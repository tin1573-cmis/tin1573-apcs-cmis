
public class Pythagorean
{
    private double a;
    private double b;
    private double c;
    public Pythagorean(double a, double b, double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double[] getAandBandC()
    {
        double[] result = { this.a, this.b, this.c };
        return result;
    }

    public void setAandBandC(double newA, double newB, double newC)
    {
        this.a=newA;
        this.b=newB;
        this.b=newB;
    }

    public double[] calc()
    {
        if (a == 0)
        {
            a=Math.sqrt(((c*c)-(b*b)));
        }
        else if (b == 0)

        {
            b=Math.sqrt(((c*c)-(a*a)));
        }
        else if(c == 0 )

        {
            c=Math.sqrt(((b*b)+(a*a)));
        }
        double[] result = { this.a, this.b, this.c };
        return result;
    }

   
    public String toString()
    {
        String result = String.format( 
                "a: %f\n" +
                "b: %f\n" +
                "c: %f\n"  
            , a ,b ,c); 

        return result;

    }//toString
}

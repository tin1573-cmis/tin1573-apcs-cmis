public class Cubiverse
{
    private String name;
    private int w;
    private int h;
    private int d;
    private double x;
    private double y;
    private double z;
    String dname = "";

    public Cubiverse()
    {
        name = "Default Cubiverse- " + "\n" + Math.random();
        w=1;
        h=1;
        d=1;
        x=0.5;
        y=0.5;
        z=0.5;

    }//contructor
    public Cubiverse( int w, int h, int d, String name)
    {
        this.name = name;
        this.w=w;
        this.h=h;
        this.d=d;
        x=0.5;
        y=0.5;
        z=0.5;
    }//contructor
    public Cubiverse( double x, double y, double z, String name)
    {
        this.name = name;
        this.x=x;
        this.y=y;
        this.z=z;
        w=1;
        h=1;
        d=1;
    }//contructor
    public String toString()
    {
        String output = new String();
        output = "Name: " + name  + "\n"+
        "w:" + w + "\n"+
        "h:" + h + "\n"+
        "d:" + d + "\n"+
        "Volume:" + h*w*d + "\n"+
        "x:" + String.format("%.2f", x )  + "\n"+
        "y:" + String.format("%.2f", y )+ "\n"+
        "z:" + String.format("%.2f", z  )+ "\n" + 
        "distance from left: " + String.format("%.2f", w*x) + "\n" +
        "distance from bottom: " + String.format("%.2f", h*y) + "\n" +
        "distance from back: " + String.format("%.2f", d*z ) + "\n";
        return output;

    }//toString
}  //instant variable 

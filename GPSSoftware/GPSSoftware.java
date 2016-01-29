import java.util.ArrayList;
public class GPSSoftware
{
    private ArrayList<Marker> Trail= new ArrayList<Marker>();
    public GPSSoftware()
    {
        Trail.add(new Marker(0,100));
        Trail.add(new Marker(1,150));
        Trail.add(new Marker(2,105));
        Trail.add(new Marker(3,120));
        Trail.add(new Marker(4,90));
        Trail.add(new Marker(5,80));
        Trail.add(new Marker(6,50));
        Trail.add(new Marker(7,75));
        Trail.add(new Marker(8,75));
        Trail.add(new Marker(9,70));
        Trail.add(new Marker(10,80));
        Trail.add(new Marker(11,90));
        Trail.add(new Marker(12,100));

    }
    
    public GPSSoftware(ArrayList<Marker> Trail)
    {
        this.Trail=Trail;
    }
    
    public void addMarker ( Marker newMarker )
    {
        Trail.add(newMarker);
    }

    public String toString()
    {
        String output = "Trail \n";
        for (Marker marker : Trail)
        {
            output+= marker;
        }
        return output;

    }//toString
}

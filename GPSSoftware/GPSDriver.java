import java.util.ArrayList;
public class GPSDriver
{
    public static void main (String args[])
    {
        GPSSoftware trail = new GPSSoftware();
        System.out.println(trail);

        trail.addMarker(new Marker(13,100)	);
        System.out.println(trail);

        ArrayList<Marker> randomMarkers = new ArrayList<Marker>();
        randomMarkers.add(new Marker(0,10));
        randomMarkers.add(new Marker(1,10));
        randomMarkers.add(new Marker(2,10)); 
        randomMarkers.add(new Marker(3,10));
        randomMarkers.add(new Marker(4,10));
        randomMarkers.add(new Marker(5,10));
        randomMarkers.add(new Marker(6,10));
        randomMarkers.add(new Marker(7,10));
        randomMarkers.add(new Marker(8,10));
        GPSSoftware PlainTrail = new GPSSoftware( randomMarkers);
        System.out.println(PlainTrail);

        
        ArrayList<Marker> newMarkers = new ArrayList<Marker>();
        newMarkers.add(new Marker(0,100));
        newMarkers.add(new Marker(1,200));
        newMarkers.add(new Marker(2,300)); 
        newMarkers.add(new Marker(3,400));
        newMarkers.add(new Marker(4,500));
        newMarkers.add(new Marker(5,600));
        newMarkers.add(new Marker(6,700));
        newMarkers.add(new Marker(7,800));
        newMarkers.add(new Marker(8,900));
        GPSSoftware MountainTrail = new GPSSoftware( newMarkers);
        System.out.println(MountainTrail);
    }
}

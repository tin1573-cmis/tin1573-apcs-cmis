import java.util.ArrayList;
public class GPSDriver
{
    public static void main (String args[])
    {
        GPSSoftware trail = new GPSSoftware();
        System.out.println("\nTrail A");
        System.out.println(trail);
        System.out.println("length " + trail.getLength());
        System.out.println("difficulty " + trail.Difficulty(0, trail.Trail.size()-1));
        System.out.println("level " + trail.Level(0, trail.Trail.size()-1));
        System.out.println("difficulty 3-4 " + trail.Difficulty(3, 4));
        System.out.println("level 5-6 " + trail.Level(5, 6));

        trail.addMarker(new Marker(13,100)	);
        System.out.println("\nTrail B");
        System.out.println(trail); 
        System.out.println("length " + trail.getLength());
        System.out.println("difficulty " + trail.Difficulty(0, trail.Trail.size()-1));
        System.out.println("level " + trail.Level(0, trail.Trail.size()-1));
        System.out.println("difficulty 3-4 " + trail.Difficulty(3, 4));
        System.out.println("level 5-6 " + trail.Level(5, 6));

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
        GPSSoftware PlainTrail = new GPSSoftware(randomMarkers);
        System.out.println("\nPlainTrail");
        System.out.println(PlainTrail); 
        System.out.println("length " + PlainTrail.getLength());
        System.out.println("difficulty " + trail.Difficulty(0, trail.Trail.size()-1));
        System.out.println("level " + trail.Level(0, trail.Trail.size()-1));
        System.out.println("difficulty 3-4 " + trail.Difficulty(3, 4));
        System.out.println("level 5-6 " + trail.Level(5, 6));

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
        GPSSoftware MountainTrail = new GPSSoftware(newMarkers);
        System.out.println("\nMountainTrail");
        System.out.println(MountainTrail);
        System.out.println("length " + MountainTrail.getLength());
        System.out.println("difficulty " + trail.Difficulty(0, trail.Trail.size()-1));
        System.out.println("level " + trail.Level(0, trail.Trail.size()-1));
        System.out.println("difficulty 3-4 " + trail.Difficulty(3, 4));
        System.out.println("level 5-6 " + trail.Level(5, 6));
    }
}

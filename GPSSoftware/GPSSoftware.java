import java.util.ArrayList;
public class GPSSoftware
{
    public ArrayList<Marker> Trail= new ArrayList<Marker>();
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

    public int getLength()
    {
        int length=0;
        for (int i=0; i<Trail.size(); i++)
        {
            length+= Trail.get(i).getY();
        }
        return length;
    }

    public boolean Level(int begin, int end)
    {
        boolean level=true;
        for( int i = begin; i < end; i++)
        {
            if( i > begin && Math.abs(Trail.get(i).getY() - Trail.get(i).getY()) > 10)
            {
                level = false;
            }                    
        }
        if( Trail.get(begin) == Trail.get(end) && level == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean Difficulty(int begin, int end)
    {
        int Uphill = 0;
        for(int i = 0; i < Trail.size(); i++)
        {
            if(i > 0 && Trail.get(i).getY() - Trail.get(i-1).getY() > 0)
            {
                Uphill += Trail.get(i).getY(); 
            }
        }
        if(Uphill > 100 && !Level(begin, end))
        {
            return true;
        }
        else
        {
            return false;
        }
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
        String output = "";
        for (Marker marker : Trail)
        {
            output+= marker;
        }
        return output;

    }//toString
}

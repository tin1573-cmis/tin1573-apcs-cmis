
public class MyPodDriver
{

    public static void main (String args[])
    {
        String[] songLibrary = {"To Love Somebody", "How Deep is Your Love", "Radioctive"};
        MyPod carPod = new MyPod("neon blue", 256, songLibrary[0], songLibrary[1], songLibrary[2]  );
        MyPod pod2 = new MyPod();

        System.out.println(carPod);
        System.out.println(pod2);
        for ( String song: songLibrary)
        {
            System.out.println(song);
        }
    }
}

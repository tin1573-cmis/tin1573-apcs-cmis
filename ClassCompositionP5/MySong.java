import java.util.ArrayList;
public class MySong
{
    public static void main( String[] args)
    {
        ArrayList<String> WalkMan = new ArrayList<String>();
        WalkMan.add("Babe");
        WalkMan.add("Open Arms");
        WalkMan.add("More Than a Feeling");
        WalkMan.add("I Do It For You");
        System.out.println("to string:");
        for (int i=0; i<WalkMan.size(); i++)
        {

            System.out.println(WalkMan.get(i));

        }
        System.out.println("for each:");

        for (String song : WalkMan)
        {
            System.out.println(song);
        }
    }
}

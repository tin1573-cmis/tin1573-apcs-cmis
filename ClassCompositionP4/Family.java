import java.util.ArrayList;
public class Family
{
    public static void main( String[] args)
    {
        ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("Sakesan Ussahatanon");
        myFamily.add("Arwika Ussahatanon");
        myFamily.add("Sarhtin Ussahatanon");
        myFamily.add("Ang Siew Huat");
        System.out.println("to string:");
        for (int i=0; i<myFamily.size(); i++)
        {

            System.out.println(myFamily.get(i));

        }
        System.out.println("for each:");

        for (String name : myFamily)
        {
            System.out.println(name);
        }
    }
}

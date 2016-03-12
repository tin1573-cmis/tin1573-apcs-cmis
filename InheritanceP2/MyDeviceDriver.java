import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)

    {
        LED LEDtv = new LED();
        DLP DLPtv = new DLP("DLP Ruby", 499.99);
        Plasma Plasmatv = new Plasma();
        LCD LCDtv = new LCD("LCD Bronze", 278.78);

        ArrayList<Television> TVsInStore = new ArrayList<Television>();
        TVsInStore.add(LEDtv);
        TVsInStore.add(DLPtv);
        TVsInStore.add(Plasmatv);
        TVsInStore.add(LCDtv);

        System.out.print("TVs in the store...\n");
        for(Television eachTV: TVsInStore)
        {
            System.out.println(eachTV);
        }
    }
}

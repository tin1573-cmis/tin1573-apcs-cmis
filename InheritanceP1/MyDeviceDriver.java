import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)

    {
        MyPhone phone1 = new MyPhone();
        MyPhone phone2 = new MyPhone(8, "Pink", "ATT");
        MyPod pod1 = new MyPod();
        MyPod pod2 = new MyPod(16, "Red");
        MyHatScreen hatScreen1 = new MyHatScreen();
        MyHatScreen hatScreen2 = new MyHatScreen(32, "White", 14, 10);

        ArrayList<MyDevice> devices = new ArrayList<MyDevice>();
        devices.add(phone1);
        devices.add(phone2);
        devices.add(pod1);
        devices.add(pod2);
        devices.add(hatScreen1);
        devices.add(hatScreen2);
        
        for(MyDevice device: devices)
        {
            System.out.println(device + "\n");
        }
    }
}
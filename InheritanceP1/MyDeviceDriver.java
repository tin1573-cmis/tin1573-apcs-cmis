import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)

    {
        MyPhone phone1 = new MyPhone();
        MyPhone phone2 = new MyPhone(8, "Pink", "ATT");
        MyPod pod1 = new MyPod();
        MyPod pod2 = new MyPod(16, "Red");
       HermesSportBoot boot1 = new HermesSportBoot();
        HermesSportBoot boot2 = new HermesSportBoot(76, "White", 14);

        ArrayList<MyDevice> devices = new ArrayList<MyDevice>();
        devices.add(phone1);
        devices.add(phone2);
        devices.add(pod1);
        devices.add(pod2);
        devices.add(boot1);
        devices.add(boot2);
        
        for(MyDevice device: devices)
        {
            System.out.println(device + "\n");
        }
    }
}
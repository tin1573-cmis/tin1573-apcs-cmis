import java.util.ArrayList;
public class DeviceDriver
{
    public static void main(String[] args)

    {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(8, "Pink", "ToT");
        Pod pod1 = new Pod();
        Pod pod2 = new Pod(16, "Pink");
        Car car1 = new Car(40);
        Car car2 = new Car(8, 50);
        ArrayList<Connectables> devices = new ArrayList<Connectables>();
        devices.add(phone1);
        devices.add(phone2);
        devices.add(pod1);
        devices.add(pod2);
        devices.add(car1);
        devices.add(car2);
        
        for(Connectables device: devices)
        {
            System.out.println(device + "\n");
        }
        
        for(Connectables device: devices)
        {
            device.connectToBluetooth();
        }
        
        System.out.println("\n" + car1.canDiscount());
        System.out.println(car2.canDiscount());
    }
}
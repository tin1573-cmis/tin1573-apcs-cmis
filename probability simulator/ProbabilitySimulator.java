import javax.swing.JOptionPane;
public class ProbabilitySimulator
{

    public static void main (String args[])
    {
        String type=JOptionPane.showInputDialog("di or coin ");

        if(type.equals("coin"))
        {
            String[] coinFace={"Head", "Tail"};
            int head=0;
            int tail=0;
            int times = Integer.parseInt(JOptionPane.showInputDialog("how many flips: "));
            for( int i=0; i<times; i++)
            {
                String face=coinFace[(int)(Math.random()*2)];
                if (face.equals("Head"))
                {
                    head +=1;
                }
                else
                {
                    tail +=1;
                }
            }
            System.out.println("head: " + head + "\n" + "tail: " + tail);
        }
        if(type.equals("di"))
        {
            int faces = Integer.parseInt(JOptionPane.showInputDialog("how many faces: "));
            int times = Integer.parseInt(JOptionPane.showInputDialog("how many rolls: "));
            int [] diFace= new int [faces];
            int [] frequency= new int [faces];
            for (int i = 0; i< faces; i++)
            {
                diFace[i]=i+1;
            }
            for( int i=0; i<times; i++)
            {
                int face=diFace[(int)(Math.random()*faces)];

                for (int e = 0 ; e< faces; e++)
                {
                    if (face == diFace[e])
                    {
                        frequency[e]+=1;
                    }
                }
            }
            for( int i=0; i<faces; i++)
            {
                System.out.println(diFace[i] + ":  " + frequency[i]);
            }
        }
       
    }
}

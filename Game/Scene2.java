import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Scene2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene2 extends World
{

    /**
     * Constructor for objects of class Scene.
     * 
     */
    public Scene2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1090, 590, 1); 
        prepare();

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        g1 ground = new g1();
        addObject(ground,50,600);
        g1 ground2 = new g1();
        addObject(ground2,200,600);
        g1 ground3 = new g1();
        addObject(ground3,350,600);
        g1 ground4 = new g1();
        addObject(ground4,500,600);
        g1 ground5 = new g1();
        addObject(ground5,650,600);
        g1 ground6 = new g1();
        addObject(ground6,800,600);
        g1 ground7 = new g1();
        addObject(ground7,950,600);
        g1 ground8 = new g1();
        addObject(ground8,1100,600);

        health1 health1 = new health1();
        addObject(health1,51,40);
        health2 health2 = new health2();
        addObject(health2,60,92);
        Ch1s ch1s = new Ch1s();
        addObject(ch1s,133,519);
        Ch2s ch2s = new Ch2s();
        addObject(ch2s,952,510);

        health1.setLocation(70,10);
        health2.setLocation(200,10);
        health1.setLocation(70,10);
        health2.setLocation(200,10);

        health4 health4 = new health4();
        addObject(health4,400,10);
        health3 health3 = new health3();
        addObject(health3,600,10);
        g2 g2 = new g2();
        addObject(g2,967,394);
        g2 g22 = new g2();
        addObject(g22,827,129);
        g2 g23 = new g2();
        addObject(g23,222,353);
        g2 g24 = new g2();
        addObject(g24,467,134);
        g1 g19 = new g1();
        addObject(g19,746,489);
        g1 g110 = new g1();
        addObject(g110,219,222);
        g1 g111 = new g1();
        addObject(g111,969,158);
        g1 g112 = new g1();
        addObject(g112,671,263);
        g1 g113 = new g1();
        addObject(g113,313,461);
        g3 g3 = new g3();
        addObject(g3,737,445);
        g3 g32 = new g3();
        addObject(g32,280,419);
        g3 g33 = new g3();
        addObject(g33,1032,124);
    }
    private int time =100;
    private int time2=100;
    private int count = 1;
    private int count2=1;
    private int time3=100;
    private int count3 = 1;

    public void act() 
    {

        if(time == 0)
        {
            healthRegen r1 = new healthRegen();
            addObject(r1, (int)(Math.random()*1125),(int) (Math.random( )*600));
            time = 100;
            count = 360;
        }
        if(time2 == 0)
        {
            Change ch = new Change();
            addObject(ch, (int)(Math.random()*1125),(int) (Math.random( )*600));
            time2 = 700;
            count2 = 360;
        }

        if(counter())
        {
            time--;
            count = 1;
            time2--;
            count2=1;

        }
        addFallingObject();
    }    

    public void addFallingObject()
    {
        FallingObject fb= new FallingObject();
        FallingObject fb2= new FallingObject();
        FallingObject fb3= new FallingObject();
        FallingObject fb4= new FallingObject();
        FallingObject fb5= new FallingObject();
        FallingObject fb6= new FallingObject();
        FallingObject fb7= new FallingObject();
        FallingObject fb8= new FallingObject();
        FallingObject fb9= new FallingObject();
        FallingObject fb10= new FallingObject();

        ArrayList<FallingObject> fbs= new ArrayList <FallingObject>();

        fbs.add(fb);
        fbs.add(fb2);
        fbs.add(fb3);
        fbs.add(fb4);    
        fbs.add(fb5);   
        fbs.add(fb6);       
        fbs.add(fb7);   
        fbs.add(fb8);     
        fbs.add(fb9);
        fbs.add(fb10);

        if(time3 == 0)
        {
            time3 = 1000;
            count3 = 360;
            for(int i = 0; i<10;i++)
            {
                int random=((int)(Math.random()*1090)+1);
                addObject(fbs.get(i),random,11);
            }

        }
        if(counter())
        {

            time3--;
            count3=1;

        }
    }

    private boolean counter()
    {
        if(count > 0)
        {
            count--;
        }
        return count == 0;
    }

}

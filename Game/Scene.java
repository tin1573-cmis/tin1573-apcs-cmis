import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene extends World
{

    /**
     * Constructor for objects of class Scene.
     * 
     */
    public Scene()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1125, 600, 1); 

        prepare();

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,50,600);
        Ground ground2 = new Ground();
        addObject(ground2,200,600);
        Ground ground3 = new Ground();
        addObject(ground3,350,600);
        Ground ground4 = new Ground();
        addObject(ground4,500,600);
        Ground ground5 = new Ground();
        addObject(ground5,650,600);
        Ground ground6 = new Ground();
        addObject(ground6,800,600);
        Ground ground7 = new Ground();
        addObject(ground7,950,600);
        Ground ground8 = new Ground();
        addObject(ground8,1100,600);

        Ground ground9 = new Ground();
        addObject(ground9,656,347);
        Ground ground10 = new Ground();
        addObject(ground10,411,356);
    }

    private int time = 20;
    private int count =1;
    
    public void act() 
    {
        if(time == 0)
        {
            healthRegen r1 = new healthRegen();
            addObject(r1, (int)(Math.random()*1125),(int) (Math.random( )*600));
            time = 10;
            count = 360;
        }
        if(counter())
        {
            time--;
            count = 1;
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


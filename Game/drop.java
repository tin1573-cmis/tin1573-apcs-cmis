import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class drop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class drop extends Actor
{
    /**
     * Act - do whatever the drop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World world=(World)getWorld();
        
        if (isAtEdge())
        {
            world.removeObject(this);
        }
    }    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class slow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class slow extends Ammo
{
    /**
     * Act - do whatever the slow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
 if (isAtEdge())
        {
            getWorld().removeObject(this);
        }

         move(5);
    }    
}

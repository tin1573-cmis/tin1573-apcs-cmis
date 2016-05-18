import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class health2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class health2 extends Counter
{
    /**
     * Act - do whatever the health2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(getWorld().getObjects(Ch2s.class).size() != 0)
        {
            int health2 = ((Ch2s) getWorld().getObjects(Ch2s.class).get(0)).getHealth();
            setImage(new GreenfootImage("Health 2 : " + health2, 24, Color.GREEN, Color.BLACK));
        }  
    }  
}

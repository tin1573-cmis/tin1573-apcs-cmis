import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class health1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class health1 extends Counter
{
    /**
     * Act - do whatever the health1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getWorld().getObjects(Ch1s.class).size() != 0)
        {

            int health1 = ((Ch1s) getWorld().getObjects(Ch1s.class).get(0)).getHealth();
            setImage(new GreenfootImage("Health 1 : " + health1, 24, Color.GREEN, Color.BLACK));
        }    
    }
}

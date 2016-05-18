import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class health3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class health3 extends Counter
{
    /**
     * Act - do whatever the health3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getWorld().getObjects(SuperCh1.class).size() != 0)
        {

            int health3 = ((SuperCh1) getWorld().getObjects(SuperCh1.class).get(0)).getHealth();
            setImage(new GreenfootImage("Health 1 Bonus : " + health3, 24, Color.GREEN, Color.BLACK));
        }
    }    
}

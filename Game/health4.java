import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class health4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class health4 extends Counter
{
    /**
     * Act - do whatever the health4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getWorld().getObjects(SuperCh2.class).size() != 0)
        {
            int health4 = ((SuperCh2) getWorld().getObjects(SuperCh2.class).get(0)).getHealth();
            setImage(new GreenfootImage("Health 2 Bonus : " + health4, 24, Color.GREEN, Color.BLACK));
        }    
    }
}

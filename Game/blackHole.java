import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blackHole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blackHole extends drop
{
    /**
     * Act - do whatever the blackHole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        change();

    } 

    public void change()
    {
        if (isTouching(Ch.class)|| isTouching(SuperCh.class))
        {
            if (getWorld() instanceof Scene2)
            {
                Scene1 newWorld = new Scene1();
                Greenfoot.setWorld(newWorld);

            }
            else 
            {
              Scene2 newWorld2 = new Scene2();
                Greenfoot.setWorld(newWorld2);
            }
        }
    }
}

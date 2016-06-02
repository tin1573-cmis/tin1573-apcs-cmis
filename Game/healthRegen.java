import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class healthRegen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class healthRegen extends drop
{
    /**
     * Act - do whatever the healthRegen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int vSpeed = 0;
    private int acceleration = 1;
    private int speed = 4;
    public void act() 
    { 
        if(getX()>=0)
        {
            super.act();

            checkFall();
        }
    }

    public boolean onGround()
    { 
        int x =1;
        if(getWorld()!=null)
        {
            Object under = getOneObjectAtOffset(0, getImage().getHeight()/2-8 , null);
            if (under != null)
            {
                x=0;
            }
            else
            {
                x=1;
            }
        }
        return x!=1;
    }

    public void fall()
    {
        if(getWorld()!=null)
        {
            setLocation(getX(), getY() + vSpeed);
            if(vSpeed <=9)
            {
                vSpeed = vSpeed + acceleration;
            }
        }
    }

    public void checkFall()
    {
        if(getWorld()!=null)
        {
            if(onGround())
            {
                vSpeed = 0;
            }
            else
            {
                fall();
            }
        }
    }
}

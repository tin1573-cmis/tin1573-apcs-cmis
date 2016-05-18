import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class g3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class g3 extends Ground
{
    int health = 10;
    public void act() 
    {
        getHealth();
        dead();
    }  

    private int getHealth()
    {
        return health;
    }

    private void loseHealth()
    {

        this.health +=-1;

    }

    private void gainHealth()
    {
        this.health+= 10;
    }

    private void dead()
    {
        if (isTouching(b3.class) ||isTouching(b4.class) || isTouching(b1.class) ||isTouching(b2.class) )
        {
            loseHealth();
            Actor actor1 = getOneIntersectingObject(b1.class);
            getWorld().removeObject(actor1);
            Actor actor2 = getOneIntersectingObject(b2.class);
            getWorld().removeObject(actor2);
            Actor actor3 = getOneIntersectingObject(b3.class);
            getWorld().removeObject(actor3);
            Actor actor4 = getOneIntersectingObject(b4.class);
            getWorld().removeObject(actor4);
        }
        if (health == 0)
        {
            getWorld().removeObject(this);
        }
    }
}

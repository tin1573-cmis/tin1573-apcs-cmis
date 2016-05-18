import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class g2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class g2 extends Ground
{
    /**
     * Act - do whatever the g2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int health = 3;
    private int speed = 2;
    private int x =50;
    public void act() 
    {
        getHealth();
        dead();

        if(getWorld()!=null)
        {
            if (x>5)
            {
                setLocation ( getX() , getY() + speed);
                x -= 1; 
            }
            else if (x<=5)
            {
                if (x==5 )
                {
                    x= -50;
                }
                setLocation ( getX() , getY() - speed);

                x += 1;
                if  (x==4)
                {
                    x=60;
                }

            }

            setLocation ( getX() - (int)(Math.random()*5), getY());
            setLocation ( getX() + (int)(Math.random()*5), getY());
        }
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

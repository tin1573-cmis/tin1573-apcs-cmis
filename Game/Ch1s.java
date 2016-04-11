import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * The class Mover provides some basic movement methods. Use this as a superclass
 * for other actors that should be able to move left and right, jump up and fall 
 * down.
 */
public class Ch1s extends Ch
{
    private boolean jumping;
    private int vSpeed = 0;
    private int health = 100;
    public void act() 
    {
        checkKeys();        
        getHealth();
        regen();
        dead();
        dead2();
        super.act();
    }

    private void gainHealth()
    {
        this.health+= 10;
    }

    private void regen()
    {
        if (isTouching(healthRegen.class) && health <= 90)
        {
            gainHealth();
            Actor actor = getOneIntersectingObject(healthRegen.class);
            getWorld().removeObject(actor);
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

    private void dead2()
    {
        if (isTouching(b4.class))
        {
            loseHealth();
            loseHealth();
            loseHealth();
            loseHealth();
            loseHealth();
            Actor actor = getOneIntersectingObject(b4.class);
            getWorld().removeObject(actor);
        }
        if (health == 0)
        {
            getWorld().removeObject(this);
        }
    }

    private void dead()
    {
        if (isTouching(b2.class))
        {
            loseHealth();
            Actor actor = getOneIntersectingObject(b2.class);
            getWorld().removeObject(actor);
        }
        if (health == 0)
        {
            getWorld().removeObject(this);
        }
    }

    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left") )
        {
            moveLeft();
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("right") )
        {
            moveRight();
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("up") )
        {
            if (onGround())
            {
                jump();
            }
        }

        if (Greenfoot.isKeyDown("/") )
        {
            fireFast();
        }
        if (Greenfoot.isKeyDown(".") )
        {
            fireSlow();
        }
    }    

    private void fireFast()
    {
        b1 ammo = new b1();
        if(getRotation()==0)
        {
            getWorld().addObject(ammo, getX()+30, getY());
        }
        else if (getRotation()==180)
        {
            getWorld().addObject(ammo, getX()-30, getY());
        }
        ammo.setRotation(getRotation());

    }

    private void fireSlow()
    {
        b3 ammo = new b3();
        if(getRotation()==0)
        {
            getWorld().addObject(ammo, getX()+40, getY());
        }
        else if (getRotation()==180)
        {
            getWorld().addObject(ammo, getX()-40, getY());
        }

        ammo.setRotation(getRotation());

    }

    public void jump()
    {
        super.jump();
    }

    public void checkFall()
    {
        super.checkFall();
    }

    public void moveRight()
    {
        super.moveRight();
    }

    public void moveLeft()
    {
        super.moveLeft();
    }

    public boolean onGround()
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2-8 , null);
        return under != null;
    }

    public void setVSpeed(int speed)
    {
        vSpeed = speed;
    }

    public void fall()
    {
        super.fall();

    }

    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
    }

    public boolean atBottom()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        if(ground == null)
        {
            jumping = true;
            return false;
        }
        else
        {
            moveToGround(ground);
            return true;
        }
    }

}

import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * The class Mover provides some basic movement methods. Use this as a superclass
 * for other actors that should be able to move left and right, jump up and fall 
 * down.
 */
public class Ch2s extends Ch implements Shoot, Health
{
    private boolean jumping;
    private int vSpeed = 0;
    private int health = 100;

    int timer1 = 0;
    int timer2 = 0;
    public void act() 
    {
        checkKeys();        
        getHealth();
        regen();
        dead();
        dead2();
        Change();
        super.act();
        DeathxTwo();
           if(getWorld()!=null)
        {
           
            if (getY()>=getWorld().getHeight()-5)
            {
                for(int i=100; i>0;i--)
                {
                    loseHealth();
                }
                if (health <= 0)
            {
                World world;
                world = getWorld();
                
                GameOver go = new GameOver();
                world.addObject(go,500,500);
                 getWorld().removeObject(this);
                Greenfoot.stop();
            }
            }
        }
    }

    public void gainHealth()
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

    public int getHealth()
    {
        return health;
    }

    public void loseHealth()
    {

        this.health +=-1;

    }    

    public void dead2()
    {
        if(getWorld()!=null)
        {
            if (isTouching(b3.class))
            {
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                Actor actor = getOneIntersectingObject(b4.class);
                getWorld().removeObject(actor);
            }
            if (health <= 0)
            {
                World world;
                world = getWorld();
             
                GameOver go = new GameOver();
                world.addObject(go,500,500);
                 getWorld().removeObject(this);
                Greenfoot.stop();
            }
        }
    }

    private void DeathxTwo()
    {
        if(getWorld()!=null)
        {
            if (isTouching(FallingObject.class))
            {
                int h=health/2;
                for(int i = 0; i<h ; i++)
                {
                    loseHealth();
                }
                Actor actor = getOneIntersectingObject(b2.class);
                getWorld().removeObject(actor);
            }
           if (health <= 0)
            {
                World world;
                world = getWorld();
              
                GameOver go = new GameOver();
                world.addObject(go,500,500);
                 getWorld().removeObject(this);
                Greenfoot.stop();
            }
        }
    }

    public void dead()
    {
        if(getWorld()!=null)
        {
            if (isTouching(b1.class))
            {
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                loseHealth();
                Actor actor = getOneIntersectingObject(b2.class);
                getWorld().removeObject(actor);
            }
            if (health <= 0)
            {
                World world;
                world = getWorld();
               
                GameOver go = new GameOver();
                world.addObject(go,500,500);
                 getWorld().removeObject(this);
                Greenfoot.stop();
            }
        }
    }

    private void Change()
    {
        if(getWorld()!=null)
        {
            if (isTouching(Change.class))
            {
                Actor actor = getOneIntersectingObject(Change.class);
                getWorld().removeObject(actor);
                getWorld().addObject(new SuperCh2(), getX(), getY());
                getWorld().removeObject(this);
            }
        }
    }

    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("a") )
        {
            moveLeft();
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("d") )
        {
            moveRight();
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("w") )
        {
            if (onGround())
            {
                jump();
            }
        }

        if (Greenfoot.isKeyDown("f") )
        {
            fireFast();
        }
        if (Greenfoot.isKeyDown("g") )
        {
            fireSlow();
        }
    }    

    public void fireFast()
    {
        b2 ammo = new b2();

        if(timer1!= 0)
        { timer1 --;}
        if (timer1 == 0)
        {
            timer1 += 15;
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
    }

    public void fireSlow()
    {

        b4 ammo = new b4();
        if(timer2!= 0)
        { timer2 --;}
        if (timer2 == 0)
        {
            timer2 += 25;
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
    }

    public void jump()
    {
        super.jump();
    }

    public void checkFall()
    {
        super.checkFall();
    }

    private int speed = 4;
    public void moveRight()
    {
        setLocation ( getX() + speed, getY() );
    }

    public void moveLeft()
    {
        setLocation ( getX() - speed, getY() );
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

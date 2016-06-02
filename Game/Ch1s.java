import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Ch1s extends Ch implements Shoot, Health
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
            if (isTouching(b4.class))
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
            if (isTouching(b2.class))
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
                getWorld().addObject(new SuperCh1(), getX(), getY());
                getWorld().removeObject(this);
            }
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

    public void fireFast()
    {
        b1 ammo = new b1();

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

        b3 ammo = new b3();
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

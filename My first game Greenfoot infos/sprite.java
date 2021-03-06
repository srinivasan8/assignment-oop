import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

// Make the actor be able to stand on a platform.
//uses of custom-built classes and methods along with polymorphism, inheritance, exception handling, primitive data types, and java collections.
public class sprite extends Actor
{   //call a out a method using GRAVITY=1
    private final int GRAVITY= 1;
    private int velocity;// set the velocity up
    public sprite() { // another class called sprite
        velocity=0;// set the velocity number equal to hero
    }
    
    MyWorld thisGame;//use this for acting out the world.
    
    public void act()  
    {   // implements all the movement the sprite needs to do.
        fall();
        if (Greenfoot.isKeyDown("space"))jump();//
        move();//call out move object class as the method from move();
        Actor gold= getOneIntersectingObject(ball.class);
        if(isTouching(spikey.class))
        {
            
            Greenfoot.setWorld(new gameover());// if sprite touches spikey it goes to gameover.
            Greenfoot.playSound("gameover.mkv");
        }
        if(gold != null)
        {
            
            getWorld().removeObject(gold);// make the gold disappear when sprite touches it.
            thisGame.score++;// add the score whenever the sprite eats up the golden ball
    }
}
    public void fall() {
        setLocation(getX(), getY() + velocity);// make sure the the fall of sprite touches the platform
        if (isOnSolidGround()) velocity=0;
        else velocity += GRAVITY;
    }
    public void jump() {
        velocity = -10;// when it jumps so that it wont have any errors.
    }
    public void move() {// start the movement with binding up, down, left, and right key
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("Up")) y-=3;
        if(Greenfoot.isKeyDown("Down")) y+=3;
        if(Greenfoot.isKeyDown("Left")) x-=3;
        if(Greenfoot.isKeyDown("Right"))x+=3;
        setLocation(x,y);
    }
    public boolean isOnSolidGround() {// call out a method boolean with function isOnSolidGround as well as primitive data type.
        boolean isOnGround = false;
        
        if(getY() > getWorld().getHeight() - 50)isOnGround=true;// implements exception handling
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if (getOneObjectAtOffset(imageWidth / -2, imageHeight /2, platform.class) != null ||// exception handling
            getOneObjectAtOffset(imageWidth / -2, imageHeight /2, platform.class) != null)
            isOnGround= true;
        
        return isOnGround;// return the class
    }
    
}   

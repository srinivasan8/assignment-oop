import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * // Make a class gameover.
 * 
 * @author (Shravan Srinivasan) 
 * 
 */
public class gameover extends World
{

    /**
     * Constructor for objects of class gameover.
     * 
     */
    //Give the size and what the gameover looks like displayed on the image
    public gameover()
    {    
        super(600, 400, 1); 
        prepare();
    }

    public void act()
    {   
        // Bind the key q to go to start. NOTE DO NOT CLICK RESET AS THE PURPOSE OF THE GAME IS TO MAKE YOU LISTEN THE REPEATING SONGS UNTIL YOU CAN EITHER FIGURE OUT HOW TO CHEAT OR TO GO TO THE CREDIT SCENE.
        if(Greenfoot.isKeyDown("q"))
            Greenfoot.setWorld(new startmenu());

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        h h = new h();
        addObject(h,301,202);
    }
}
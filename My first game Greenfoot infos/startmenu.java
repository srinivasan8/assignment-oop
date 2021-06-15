import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//uses of custom-built classes and methods along with polymorphism, inheritance, exception handling, and java collection
public class startmenu extends World
{
    GreenfootSound myMusic= new GreenfootSound("red.wav");//add musical bakcground for all levels including start and credit scene.
    /**
     * Constructor for objects of class startmenu.
     * 
     */
    public startmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act() //make an act class when it runs the texts will show up //also add key bind F to start.
    {
        showText("Press f to start the game",410, 310);
        showText("Golden Ju", 400,222);
        showText("Creator: Shravan Srinivasan", 400,190);
        showText("NIM:24400042872", 400,270);
        if(Greenfoot.isKeyDown("f"))
        Greenfoot.setWorld(new MyWorld());
        myMusic.play();//call out myMusic function
    }
    private void prepare() // make a class prepare as an object
    {
        sprite sprite= new sprite();// so a sprite can be used later on in the game.
        addObject(sprite, 600, 400);
        platform platform = new platform();// so a platform can be used later on in game.
        addObject(platform, 450, 400);}
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)// uses the method called greenfoot

// applying extend use of polymorphism, inheritance, and methods
public class Creditscene extends World
{

    /**
     * Constructor for objects of class Creditscene
     * 
     */
    //make a class from an object called Creditscne
public Creditscene()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        // add certain texts to be display on.
        super(600, 400, 1);
        showText("Thank you for playing",400, 320);
        showText("We hope that you add fun playing the game", 400,290);
        showText("Click reset to start the game", 400,250);
        showText("My Contact number is 081513145186", 400,220);
        showText("Music:https://www.youtube.com/watch?v=fJQqOzkcHjg", 400,205);
        //when binds the key q it will go automatically to the starting page. But it is recommended to do so when you want to play some more games.
        if(Greenfoot.isKeyDown("q"))
        Greenfoot.setWorld(new startmenu());
    }
}

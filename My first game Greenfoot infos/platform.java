import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//declare class for object called platform
public class platform extends Actor
{  
   //Give location of platform 
   public platform() {
        this(100,25);
    }
   //gives the whole image sizes 
   public platform(int width, int height) {
        GreenfootImage image = getImage();
        image.scale(width,height);
        setImage(image);
    
    }
    
}
    

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class avatar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
public class avatar extends Actor
{
    /**
     * Act - do whatever the avatar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int sTimer =0;
    public int speed =5;
    public void act()
    {
        movimento();

    }
    
    
      public void movimento(){
        if (Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX() - speed, this.getY() +speed);
        }
        if (Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() + speed, this.getY());
        }
        
        
        else if (Greenfoot.isKeyDown("f") && (sTimer == 0)){
        
        sTimer ++;
        getWorld().addObject(new agua(), getX() +5, getY() + 2);
        }
        else if (!Greenfoot.isKeyDown("f")){
        sTimer = 0;
        }
 }
}    
    
    



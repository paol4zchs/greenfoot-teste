import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class goku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class goku extends Actor
{
    private int sTimer =0;
    public int speed =5;
    public void act()
    {
        movimento();
    }
    
    

    public void movimento(){
        if (Greenfoot.isKeyDown("up")){
        this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("down")){
        this.setLocation(this.getX() - speed, this.getY() +speed);
        }
        if (Greenfoot.isKeyDown("left")){
        this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("right")){
        this.setLocation(this.getX() + speed, this.getY());
        }
        
        
        else if (Greenfoot.isKeyDown("0") && (sTimer == 0)){
        
        sTimer ++;
        getWorld().addObject(new foguinho(), getX() +80, getY() + 10);
        }
        else if (!Greenfoot.isKeyDown("0")){
        sTimer = 0;
        }
    }
}


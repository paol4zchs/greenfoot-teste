import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class agua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class agua extends avatar
{
    /**
     * Act - do whatever the agua wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        acertarAlvo2();
        // add your action code here.
    }
    
    public void moveAtaque() {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() - Math.cos(angle));
        int y = (int) Math.round(getY() - Math.sin(angle));
        
        setLocation(x, y);
    }
    
    public void acertarAlvo2(){
    
    Actor b = getOneIntersectingObject(goku.class);
    
    if(b != null){
        
        Counter2 counter = (Counter2) getWorld().getObjects(Counter2.class).get(0);
        counter.add(1);
        
        getWorld().removeObject(b);
        getWorld().removeObject(this);
    }
    }

}

    


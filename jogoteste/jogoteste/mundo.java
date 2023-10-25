import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("music.mp3");
    
    public void started()
    {
    bgMusic.playLoop();
    }
    
    public void stopped(){
    bgMusic.pause();
    }
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        avatar avatar = new avatar();
        addObject(avatar,762,376);
        avatar.setLocation(703,487);
        avatar.setLocation(703,487);
        goku goku = new goku();
        addObject(goku,172,466);
        avatar.setLocation(626,493);
        avatar.setLocation(626,493);
        goku.setLocation(160,475);
        goku.setLocation(120,466);
        goku.setLocation(120,466);
        avatar.setLocation(589,204);
        goku.setLocation(433,178);
        goku.setLocation(406,182);
        avatar.setLocation(555,221);
        Counter counter = new Counter();
        addObject(counter,724,33);
        agua agua = new agua();
        addObject(agua,695,235);
        removeObject(agua);
        Counter counter2 = new Counter();
        addObject(counter2,67,29);
        counter2.setLocation(67,29);
    }
}

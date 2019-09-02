import greenfoot.*;

public class TampilanMain extends World
{ 
   
    private int jeda=0;
    GreenfootSound ombak3 = new GreenfootSound("OMBAKFIX.mp3");
    public void started()
    {
        ombak3.playLoop();
        
    }
    public TampilanMain()
    {    
        super(600,400,1);  
        addObject(new Nelayan(),100,200);
    }
     public void act()
    {
        if(jeda>0)jeda--;
        else jeda=60;
        if(jeda==2)
        {
        int py=Greenfoot.getRandomNumber(getHeight());
        addObject(new BajakLaut(-(2+Greenfoot.getRandomNumber(2))),getWidth()+200,py);
        } 
        if(jeda>0)jeda--;
        else jeda=40;
        if(jeda==2)
        {
        int py=Greenfoot.getRandomNumber(getHeight());
        addObject(new Ikan(-(2+Greenfoot.getRandomNumber(2))),getWidth()+200,py);
        }

    }
}
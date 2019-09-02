import greenfoot.*;

public class TombolMain extends Actor
{
   public void act() 
    {
       if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new TampilanMain());
        }
    }     
}

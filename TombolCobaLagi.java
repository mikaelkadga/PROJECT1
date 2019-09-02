import greenfoot.*;

public class TombolCobaLagi extends Actor
{
    public void act() 
    {
       if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new TampilanMain());
        }
    }    
}

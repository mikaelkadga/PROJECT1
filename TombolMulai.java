import greenfoot.*;

public class TombolMulai extends Actor
{
     public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new TampilanMulai());
        }
    }      
}

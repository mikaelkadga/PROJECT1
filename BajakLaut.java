import greenfoot.*;

public class BajakLaut extends Actor
{
    private int vx=0;
    
    public BajakLaut()
    {
        
    }
    
    public BajakLaut(int v)
    {
        vx=v;
    }
    
    
    public void addedToWorld(World TampilanMain)
    {
        setRotation(0);
    }
    
    public void move()
    {
        setLocation(getX()+vx,getY());
    }
    
    
    public void act()
    {
      int x=getX();
      move(); 
      if(x==0)
     {
            getWorld().removeObject(this);
     }
    }    
}

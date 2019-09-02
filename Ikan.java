import greenfoot.*;

public class Ikan extends Actor
{
   
    private int vx=0;
    
    public Ikan()
    {
        
    }
    
    public Ikan(int v)
    {
        vx=v;
    }
    
    
    public void addedToWorld(World Laut)
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

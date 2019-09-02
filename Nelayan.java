import greenfoot.*;

public class Nelayan extends Actor
{
    int skor=0;
    public int SkorNelayan=0;
    public void act() 
    {
       if(Greenfoot.isKeyDown("up"))
    {
        setLocation(getX(), getY()-6);
    }
    else if(Greenfoot.isKeyDown("down"))
    {       
        setLocation(getX(), getY()+6);
    }
    else if(Greenfoot.isKeyDown("right"))
    {
        move(6);
    }
    else if(Greenfoot.isKeyDown("left"))
    {
        move(-6);
    }
    getWorld().showText("SKOR :      "+SkorNelayan,70,20);
    kenaIkan();
    kenaBajakLaut(); 
    }
    public void kenaIkan()
    {
        if(isTouching(Ikan.class))
        {
            removeTouching(Ikan.class);
            TampilanMain main1 = (TampilanMain)getWorld();
            SkorNelayan=SkorNelayan+10;
        }
    }
    public void kenaBajakLaut()
    {
        if(isTouching(BajakLaut.class))
        {
            Greenfoot.setWorld(new GameOver(SkorNelayan));
        }
    }
}

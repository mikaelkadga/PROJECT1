import greenfoot.*;

public class TampilanCaraBermain extends World
{
    public TampilanCaraBermain()
    {    
        super(600, 400, 1); 
        addObject (new LayarCaraBermain(),300,200);
        addObject (new TombolMain2(),500,350);
    }
}

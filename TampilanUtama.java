import greenfoot.*;

public class TampilanUtama extends World
{
    GreenfootSound ombak = new GreenfootSound("OMBAKFIX.mp3");
    public void started()
    {
        ombak.playLoop();   
    }

    public TampilanUtama()
    {    
        super(600, 400, 1); 
        addObject(new TombolMulai(),150,325);
        addObject(new TombolKeluar(),450,325);
        addObject(new LayarUtama(),300,170);    
    }   
}

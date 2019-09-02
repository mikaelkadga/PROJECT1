import greenfoot.*;

public class GameOver extends World
{
    public GameOver(int SkorNelayan)
    {    
        super(600, 400, 1); 
        addObject (new TombolCobaLagi(),170,325);
        addObject (new TombolKeluar2(),465,325);
        addObject (new LayarGameOver(),300,150);
        showText("SKOR :      "+SkorNelayan,420,250);
    }
}

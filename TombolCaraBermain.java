        import greenfoot.*;
        
        public class TombolCaraBermain extends Actor
        {
           public void act() 
            {
               if(Greenfoot.mouseClicked(this))
                {
                    Greenfoot.setWorld(new TampilanCaraBermain());
                }
            }        
        }

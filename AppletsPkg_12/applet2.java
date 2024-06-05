package AppletsPkg_12;

import java.applet.*;
import java.awt.*;

public class applet2 extends Applet
{
     Image picture;  
     
     public void init() 
     {
         picture = getImage(getDocumentBase(),"sachin.jpg");
     }  
    
    public void paint(Graphics g)
    {
        
        //g.drawRect(10, 20, 100, 100);
        
        g.setColor(Color.red);
        
        //g.fillRect(10, 130, 100, 100);
        
        //g.drawOval(60, 20,100, 70);
        
        //g.drawArc(100, 200, 60, 50, 0, 180);
        
        //g.fillArc(300, 200, 60, 50, 0, 180);
        
        int[] x = {10, 160, 100, 160, 10, 60};
        int[] y = {70,70, 115, 160, 160, 115};
        
       // g.drawPolygon(x, y, 5);
        
        //inserting images
        //g.drawImage(picture, 100,100, this); 
    }
    
}


/* 
<applet code="applet2.class" width="1000" height="500"> 
</applet> 
*/ 
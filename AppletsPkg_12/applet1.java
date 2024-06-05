package AppletsPkg_12;

import java.applet.Applet;
import java.awt.*;

public class applet1 extends Applet
{   
    public void paint(Graphics g)
    {
        //Color 
        g.setColor(Color.RED);
        
        //font
        g.setFont(new Font("Arial", Font.ITALIC, 20));
        //Create a string
        g.drawString("Welcome to Applet", 100, 20);
        
        g.setColor(Color.BLACK);
        
        //Line Drawing
        g.drawLine(100, 25, 225, 25);
        
        //rect draw drawing
        g.drawRect(100, 30, 200, 50);
        
        g.setColor(Color.PINK);
        
        //fill rect drawing
        g.fillRect(100,100 , 200, 50);
        
        g.setColor(Color.BLACK);
        
        //arc drawing
        //g.drawArc(100, 160, 100, 50, 0, 270);
        
        g.fillArc(100, 160, 200, 50, 0, 180);
        
        
        //drawing ovals
        
        g.drawOval(100, 200, 200, 400);
        
        g.fillOval(150, 250, 30, 30);
        
        int x[]={100,150,200};
        int y[]={300,250,300};
        
        g.fillPolygon(x, y,3);
        
        
    }
}

/* 
<applet code="applet1.class" width="1000" height="500"> 
</applet> 
*/ 

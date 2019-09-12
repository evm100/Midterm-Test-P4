import apcslib.*;
import java.awt.Color;
import chn.util.*;

public class LogoDesign {
    public void displayLogo() {
        DrawingTool marker;
        SketchPad poster;
        poster = new SketchPad(800,800); 
        marker = new DrawingTool(poster);
        
        marker.setWidth(2);
      
        //front face 
        marker.move(0,100);
        marker.move(120,100);
        marker.move(120,0);
        marker.move(0,0);
        
        //left face
        marker.up();
        marker.move(0,0); //resetting position of marker to bottom left corner of front face
        marker.down();
        marker.move(-20,20);
        marker.move(-20,120);
        marker.move(0,100);
        
        //top face
        marker.up();
        marker.move(-20,120); //resetting position to top-most point of left face 
        marker.down();
        marker.move(100, 120);
        marker.move(120, 100);
        
        //screen
        marker.up();
        marker.move(10,10);//resetting position to bottom left of screen
        marker.down();
        marker.move(10,90);
        marker.move(110,90);
        marker.move(110,10);
        marker.move(10,10);
        
        //displaying text on computer screen
        marker.up();
        marker.move(25,45); //resetting position to even space text on screen
        marker.down();
        marker.drawString("Mr.M's Test");
        
        //computer front face
        marker.up();
        marker.move(-30,0);//resetting position to bottom right of computer front face
        marker.down();
        marker.move(-100,0);
        marker.move(-100,150);
        marker.move(-30,150);
        marker.move(-30,0);
      
        //computer side face
        marker.up();
        marker.move(-100,0);// resetting position to bottom left of computer front face
        marker.down();
        marker.move(-150,30);
        marker.move(-150,180);
        marker.move(-100,150);
        
        //computer top face
        marker.up();
        marker.move(-150,180);// resetting position to top most point of computer side face
        marker.down();
        marker.move(-80,180);
        marker.move(-30,150);
    }
}


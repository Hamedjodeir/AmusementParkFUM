package shapes;

import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class CirclePanel extends Canvas {
    
    
    public void paint(Graphics g) {
        
        g.drawOval(10, 10, 100, 100);
    }
}
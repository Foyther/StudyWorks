import javax.swing.*;
import java.awt.*;

public class Painting extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.orange);
        g.setColor(Color.CYAN);
        g.fillRect(20,20,100,100);
    }
}

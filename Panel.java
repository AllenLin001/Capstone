import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.ArrayList;
import java.awt.Rectangle;

public class Panel extends JPanel implements ActionListener {
    private Timer delay;
    private Turtle turtle;
    private Image sea; 
    private Shark shark;
    private boolean gaming;
    // chances of shooting waterball // 
    private int count = 5; 
    public Panel() {

        addKeyListener(new windowAdapter());
        setFocusable(true);
        setDoubleBuffered(true);
        gaming = true; 
        turtle = new Turtle();
        shark = new Shark();
        ImageIcon ii = new ImageIcon("C:\\Users\\Shuo\\Pictures\\TheSea.png");
        sea = ii.getImage();
        delay = new Timer(6, this);
        delay.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(sea,0,0,this); 
        g2d.drawImage(turtle.getImage(), turtle.getX(), turtle.getY(), this); 
        g2d.drawImage(shark.getImage(),shark.getX(),shark.getY(),this);
        ArrayList waterballs = turtle.getWaterballs();
        for (int i=0; i<waterballs.size();i++)
        {
            Waterball wb = (Waterball)waterballs.get(i);
            g2d.drawImage(wb.getImage(),wb.getX()-80,wb.getY()-15,this);
        }

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void actionPerformed(ActionEvent event) {
        turtle.move();
        shark.move();
        ArrayList waterballs = turtle.getWaterballs();
        for (int i = 0; i<waterballs.size(); i++)
        {
            Waterball wb = (Waterball) waterballs.get(i);
            wb.move(); 
        }
        repaint();  
    }

    private class windowAdapter extends KeyAdapter {
        public void keyReleased(KeyEvent event) {
            turtle.keyReleased(event);
            shark.keyReleased(event);
        }

        public void keyPressed(KeyEvent event) {
            turtle.keyPressed(event);
            shark.keyPressed(event); 
        }
    }

}
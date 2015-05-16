import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Turtle {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private int width, height; 
    private Image image;
    private ArrayList waterballs; 
    private boolean visible; 
    
    public Turtle() {
        waterballs = new ArrayList(); 
        visible = true; 
        ImageIcon ii = new ImageIcon("C:\\Users\\Shuo\\Pictures\\turtle.png");
        image = ii.getImage();
        x = 1400;
        y = 400;
        width = 90;
        height = 60; 
    }
    
    public ArrayList getWaterballs()
    {
        return waterballs; 
    }
    public void move() {
        x += dx;
        y += dy;
        if (x>1470){x=1470;}
        if (x<1){x=1;}
        if(y>770){y=770;}
        if(y<1) {y=1;}
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }
    
    public void setVisible (boolean visible)
    {
        this.visible = visible; 
    }
    
    public boolean isVisible()
    {
        return visible; 
    }
    
    public Rectangle getBounds() 
    {
        return new Rectangle(x, y, width, height);
    }
    
    public void keyPressed(KeyEvent event) {

        int key = event.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -3;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 3;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -3;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 3;
        }

        if (key == KeyEvent.VK_SPACE) {
            fire();
        }
    }

    public void fire() 
    {
        waterballs.add(new Waterball(x + width -80, y + height/2 -15));
    }

    public void keyReleased(KeyEvent event) {
        int key = event.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}

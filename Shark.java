import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

public class Shark {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;

    public Shark() {
        ImageIcon ii = new ImageIcon("C:\\Users\\Shuo\\Pictures\\shark.png");
        image = ii.getImage();
        x = 300;
        y = 400;
    }


    public void move() {
        x += dx;
        y += dy;
        if (x>1470){x=1470;}
        if (x<1){x=1;}
        if(y>770){y=770;}
        if(y<1){y=1;}
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
    public void keyPressed(KeyEvent event) {

        int key = event.getKeyCode();

        if (key == KeyEvent.VK_A) {
            dx = -6;
        }

        if (key == KeyEvent.VK_D) {
            dx = 6;
        }

        if (key == KeyEvent.VK_W) {
            dy = -6;
        }

        if (key == KeyEvent.VK_S) {
            dy = 6;
        }
    }

    public void keyReleased(KeyEvent event) {
        int key = event.getKeyCode();

        if (key == KeyEvent.VK_A) {
            dx = 0;
        }

        if (key == KeyEvent.VK_D) {
            dx = 0;
        }

        if (key == KeyEvent.VK_W) {
            dy = 0;
        }

        if (key == KeyEvent.VK_S) {
            dy = 0;
        }
    }
}

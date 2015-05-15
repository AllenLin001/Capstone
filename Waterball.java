import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Waterball {

    private int x, y, width, height;
    private Image waterball;
    boolean visible;
    private final int BOARD_WIDTH = 1536;
    private final int WATERBALL_SPEED = 4;

    public Waterball(int x, int y) {

        ImageIcon ii = new ImageIcon("C:\\Users\\Shuo\\Pictures\\waterball.png");
        waterball = ii.getImage();
        visible = true;
        width = 39;
        height = 39;
        this.x = x;
        this.y = y;
    }


    public Image getImage() {
        return waterball;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public void move() {
        x -= WATERBALL_SPEED;
        if (x > BOARD_WIDTH)
            visible = false;
    }
}
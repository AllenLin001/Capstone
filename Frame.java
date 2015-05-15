
import javax.swing.JFrame;

public class Frame extends JFrame {
    
    public static final int FRAME_WIDTH = 1536;
    public static final int FRAME_HEIGHT = 864; 
    
    public Frame() {

        add(new Panel());
        setSize(FRAME_WIDTH,FRAME_HEIGHT); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Escape The Sharks");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Frame();
    }
}
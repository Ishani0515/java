import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MultiColorFrame extends Frame {
    private Color[] colors = {
        Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW,
        Color.ORANGE, Color.CYAN, Color.MAGENTA, Color.PINK,
        Color.GRAY, Color.LIGHT_GRAY
    };

    public MultiColorFrame() {
        setSize(800, 600);
        setTitle("Multi-Color Frame");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void paint(Graphics g) {
        int colorIndex = 0;
        for (int x = 0; x < getWidth(); x += getWidth() / colors.length) {
            g.setColor(colors[colorIndex]);
            g.fillRect(x, 0, getWidth() / colors.length, getHeight());
            colorIndex = (colorIndex + 1) % colors.length;
        }
    }

    public static void main(String[] args) {
        new MultiColorFrame();
    }
}

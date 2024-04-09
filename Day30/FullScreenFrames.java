import java.awt.*;

public class FullScreenFrames {

    public static void main(String[] args) {
        // Create a JFrame object and set its size to the screen size
        JFrame frame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);

        // Create four Frame objects and set their sizes, locations, and background colors
        Frame redFrame = new Frame();
        redFrame.setSize(screenSize.width / 2, screenSize.height / 2);
        redFrame.setLocation(0, 0);
        redFrame.setBackground(Color.RED);

        Frame blueFrame = new Frame();
        blueFrame.setSize(screenSize.width / 2, screenSize.height / 2);
        blueFrame.setLocation(screenSize.width / 2, 0);
        blueFrame.setBackground(Color.BLUE);

        Frame greenFrame = new Frame();
        greenFrame.setSize(screenSize.width / 2, screenSize.height / 2);
        greenFrame.setLocation(0, screenSize.height / 2);
        greenFrame.setBackground(Color.GREEN);

        Frame yellowFrame = new Frame();
        yellowFrame.setSize(screenSize.width / 2, screenSize.height / 2);
        yellowFrame.setLocation(screenSize.width / 2, screenSize.height / 2);
        yellowFrame.setBackground(Color.YELLOW);

        // Add the Frame objects to the JFrame object
        frame.add(redFrame);
        frame.add(blueFrame);
        frame.add(greenFrame);
        frame.add(yellowFrame);

        // Set the JFrame object to be undecorated, visible, and always on top
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
    }
}

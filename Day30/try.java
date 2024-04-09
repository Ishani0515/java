import java.awt.*;

class try extends Frame {
    private static final int GAP = 10;

   try(int x, int y, Color c) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width / 3, screenSize.height / 2);
        setBackground(c);
        setLocation(x, y);
        setVisible(true);
    }

    public static void main(String args[]) {
       try w1 = new try(0, 0, Color.red);
        try w2 = new try(w1.getX() + w1.getWidth() + GAP, 0, Color.blue);
        try w3 = new try(w2.getX() + w2.getWidth() + GAP, 0, Color.yellow);
       
    }
}

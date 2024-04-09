import java.awt.*;
import java.awt.event.*;

class Shapes extends Frame implements ActionListener, WindowListener
 {
    Button b;
    Label l;
    Choice c;

    Shapes() 
{
        setSize(400, 300);
        setBackground(Color.YELLOW);
        setLayout(null);

        l = new Label("choose the shape");
        l.setBounds(50, 50, 120, 20);

        b = new Button("Ok");
        b.setBounds(150, 100, 100, 30);

        c = new Choice();
        c.add("Choose");
        c.add("Rectangle");
        c.add("Circle");
        c.add("Square");
        c.setBounds(180, 50, 100, 20);

        add(l);
        add(c);
        add(b);

        b.addActionListener(this);
        addWindowListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
{
        String shape = c.getSelectedItem();
        repaint(); 
    }

    public void paint(Graphics g) {
        super.paint(g); 
        String shape = c.getSelectedItem();
        g.setColor(Color.RED);

        switch (shape) {
            case "Rectangle":
                g.fillRect(100, 150, 150, 80);
                break;
            case "Circle":
                g.fillOval(100, 150, 100, 100);
                break;
            case "Square":
                g.fillRect(100, 150, 100, 100);
                break;
        }
    }

    public void windowClosing(WindowEvent e) {
        dispose();
    }

    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new Shapes();
    }
}

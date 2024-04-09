import java.awt.*;
import java.awt.event.*;

class BackgroundChoice extends Frame implements ActionListener {
    Choice c;

    BackgroundChoice() {
        Button b;
        setSize(300, 200);
        setLocation(500, 300);
        Label l = new Label("Choose your favorite color");
        b = new Button("OK");
        c = new Choice();
        c.add("Choose");
        c.add("Red");
        c.add("Green");
        c.add("Blue");
        c.add("Cyan");
        c.add("Magenta");
        c.add("Yellow");
        setLayout(null);
        l.setBounds(50, 30, 200, 20);
        c.setBounds(50, 60, 200, 20);
        b.setBounds(110, 100, 80, 30);
        add(l);
        add(c);
        add(b);
        b.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (c.getSelectedIndex() != 0) {
            String selectedColor = c.getSelectedItem();
            Color color = null;
            switch (selectedColor) {
                case "Red":
                    color = Color.RED;
                    break;
                case "Green":
                    color = Color.GREEN;
                    break;
                case "Blue":
                    color = Color.BLUE;
                    break;
                case "Cyan":
                    color = Color.CYAN;
                    break;
                case "Magenta":
                    color = Color.MAGENTA;
                    break;
                case "Yellow":
                    color = Color.YELLOW;
                    break;
            }
            if (color != null) {
                setBackground(color);
            }
        }
    }

    public static void main(String args[]) {
        BackgroundChoice ob = new BackgroundChoice();
    }
}

import java.awt.*;
import java.awt.event.*;

class KeyProject extends Frame implements KeyListener {
    Label l1, l2;
 
    int c = 0, m = 0;

    KeyProject() {
        setSize(500, 400); 
        setTitle("SchoolDays");
        l1 = new Label();
        l2 = new Label();
        l1.setFont(new Font("Arial", Font.BOLD, 50));
        l2.setFont(new Font("Arial", Font.BOLD, 70));
        setLayout(null);
        l1.setBounds(50, 50, 100, 50);
        l2.setBounds(150, 100, 500, 150);
        add(l1);
        add(l2);
        addKeyListener(this);
       
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        c++;
        if (c % 2 == 0)
            l2.setForeground(Color.blue);
        else if (c % 2 != 0)
            l2.setForeground(Color.red);
        m++;
        setSize(500, 400);
        if (m % 2 == 0)
            this.setBackground(Color.lightGray);
        else if (m % 2 != 0)
            this.setBackground(Color.cyan);
    }

    public void keyReleased(KeyEvent e) {
    }
     
    public void keyTyped(KeyEvent e) 
{
      char sch=' ';
       char ch=e.getKeyChar();
        if(ch+0>=97 && ch+0<122)
          sch=(char)(e.getKeyChar()-32);
        else if (ch+0>=65 && ch+0<90)
          sch=(char)(e.getKeyChar()+32);
         String res="";
        
        if (ch == 'A' || ch == 'a')
            res = "Apple";

        else if (ch == 'B' || ch == 'b')
            res = "Ball";

        else if (ch == 'C' || ch == 'c')
            res = "Cat";
        else if (ch == 'D' || ch == 'd')
            res = "Dog";
        else if (ch == 'E' || ch == 'e')
            res = "Elephant";
        else if (ch == 'F' || ch == 'f')
            res = "Fish";
        else if (ch == 'G' || ch == 'g')
            res = "Gun";
        else if (ch == 'H' || ch == 'h')
            res = "Hen";
        else if (ch == 'I' || ch == 'i')
            res = "Icecream";
        else if (ch == 'J' || ch == 'j')
            res = "Jocker";
        else if (ch == 'K' || ch == 'k')
            res = "Kite";
        else if (ch == 'L' || ch == 'l')
            res = "Lion";
        else if (ch == 'M' || ch == 'm')
            res = "Monkey";
        else if (ch == 'N' || ch == 'n')
            res = "Nest";
        else if (ch == 'O' || ch == 'o')
            res = "Owl";
        else if (ch == 'P' || ch == 'p')
            res = "Parrot";
        else if (ch == 'Q' || ch == 'q')
            res = "Queen";
        else if (ch == 'R' || ch == 'r')
            res = "Rabbit";
        else if (ch == 'S' || ch == 's')
            res = "Sun";
        else if (ch == 'T' || ch == 't')
            res = "Tiger";
        else if (ch == 'U' || ch == 'u')
            res = "Umbrella";
        else if (ch == 'V' || ch == 'v')
            res = "Violin";
        else if (ch == 'W' || ch == 'w')
            res = "Watch";
        else if (ch == 'X' || ch == 'x')
            res = "X-mas";
        else if (ch == 'Y' || ch == 'y')
            res = "Yak";
        else if (ch == 'Z' || ch == 'z')
            res = "Zebra";
      
        l1.setText("" + ch+sch);
        l2.setText(res);
    }

    public static void main(String args[]) {
        KeyProject ob = new KeyProject();
    }
}

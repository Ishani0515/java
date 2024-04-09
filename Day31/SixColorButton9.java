import java.awt.*;
class SixColorButton9 extends Frame
 {
 SixColorButton9() 
{
setSize(300, 200);
        Button b1 = new Button();
        Button b2 = new Button(); 
        Button b3 = new Button();
        Button b4 = new Button();
        Button b5 = new Button();
        Button b6 = new Button();

        setLayout(null);
        b1.setBounds(115, 90, 70, 20);
        b2.setBounds(115, 70, 70, 20);
        b3.setBounds(115, 50, 70, 20);
        b4.setBounds(115, 30, 70, 20);
        b5.setBounds(115, 110, 70, 20);
        b6.setBounds(115, 130, 70, 20);

        b1.setBackground(Color.green);
        b2.setBackground(Color.BLUE);
        b3.setBackground(Color.red);
        b4.setBackground(Color.BLACK);
        b5.setBackground(Color.cyan);
        b6.setBackground(Color.magenta);

 add(b1);
 add(b2);
 add(b3);
 add(b4);
 add(b5);
 add(b6);

setVisible(true);
}
public static void main(String[] args)
{
SixColorButton9 ob = new SixColorButton9();
}
}

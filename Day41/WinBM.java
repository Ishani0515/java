import java.awt.*;
import java.awt.event.*;
class WinBM extends Frame implements ActionListener,MouseListener
{
   Button b;
   WinBM()
   {
      setSize(400,300);
      b=new Button("OK");
      setLayout(null);
      b.setBounds(100,100,100,30);
      add(b);
      b.addActionListener(this);
      addMouseListener(this); 
      setVisible(true);
   }
public void actionPerformed(ActionEvent e)
   {
           setBackground(Color.white);
   }
   public void mouseClicked(MouseEvent e)
   {
      System.out.println("x="+e.getX()+" Y="+e.getY());
    }
   public void mousePressed(MouseEvent e)
   {
        System.out.println("Pressed..");
    }
   public void mouseReleased(MouseEvent e)
   {
       System.out.println("Released..");
    }
   public void mouseEntered(MouseEvent e)
   {
       setBackground(Color.blue);
    }
public void mouseExited(MouseEvent e)
   {
       setBackground(Color.yellow);
    }
   public static void main(String args[])
   {
      WinBM ob=new WinBM();
   }
}
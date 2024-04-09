import java.awt.*;
import java.awt.event.*;
class MoveXY extends Frame implements MouseMotionListener
{
    Label l;
    MoveXY()
    {
       setSize(300,300);
        l=new Label();
       setLayout(null);
       l.setBounds(10,20,100,20);
       add(l);
       addMouseMotionListener(this);
       setVisible(true);
    }
public void mouseMoved(MouseEvent e)
    {
        l.setBounds(e.getX()+5,e.getY()+10,100,20);
        l.setText("x="+e.getX()+" y="+e.getY());
System.out.println("x="+e.getX()+" y="+e.getY());
    }
    public void mouseDragged(MouseEvent e)
    {
       System.out.println("Dragged.");
    }
    public static void main(String args[])
    {
        MoveXY ob=new MoveXY();
    }
}

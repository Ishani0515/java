import java.awt.*;
import java.awt.event.*;
class MoveGame extends Frame implements MouseMotionListener
{
    Label l,res;
    int r=0;
    MoveGame()
    {
       setSize(300,300);
        res=new Label("Result="+r);
        l=new Label();
       setLayout(null);
       res.setBounds(10,30,300,20);
       l.setBounds(10,50,100,20);
       add(l);add(res);
       addMouseMotionListener(this);
       setVisible(true);
    }
public void mouseMoved(MouseEvent e)
    {
        l.setBounds(e.getX()+5,e.getY()+10,100,20);
        l.setText("x="+e.getX()+" y="+e.getY());
        if(e.getX()==e.getY())
          { r+=100;res.setText("Result="+r); }
    }
    public void mouseDragged(MouseEvent e)
    {
       System.out.println("Dragged.");
    }
    public static void main(String args[])
    {
        MoveGame ob=new MoveGame();
    }
}
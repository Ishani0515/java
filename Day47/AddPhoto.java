import java.awt.*;
import java.awt.event.*;
class AddPhoto extends Frame implements MouseWheelListener
{
	int w=200,d=170,x=100,y=80;
   Image im;
    AddPhoto()
    {
       setSize(800,600);
	addMouseWheelListener(this);
       im=Toolkit.getDefaultToolkit().getImage("cc.png");
       setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawImage(im,x,y,w,d,this);
    }
	public void mouseWheelMoved(MouseWheelEvent e)
     {
           if(e.getWheelRotation()==-1)
            {w+=10;d+=5;x+=5;y+=4;}
           if(e.getWheelRotation()==1)
            {w-=10;d-=5;x-=5;y-=4;}
		repaint();
     }

    public static void main(String args[])
    {
      AddPhoto ob=new AddPhoto();
    }
}
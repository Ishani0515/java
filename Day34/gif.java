import java.awt.*;
class ImgDemo extends Frame
{
   Image im;
    ImgDemo()
    {
       setSize(400,300);
       im=Toolkit.getDefaultToolkit().getImage("gif.gif");
       setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawImage(im,100,80,200,170,this);
    }
    public static void main(String args[])
    {
      ImgDemo ob=new ImgDemo();
    }
}

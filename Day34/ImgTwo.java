import java.awt.*;
class ImgTwo extends Frame 
{
   Image im1,im2;
    ImgTwo()
    {
       setSize(500,300);
       im1=Toolkit.getDefaultToolkit().getImage("lemon.png");
       im2=Toolkit.getDefaultToolkit().getImage("cat.png");
       setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawImage(im1,50,80,200,170,this);
        g.drawImage(im2,260,80,200,170,this);
    }
    public static void main(String args[])
    {
      ImgTwo ob=new ImgTwo();
    }
}

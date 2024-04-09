import java.awt.*;
class ImgDemoP extends Frame
{
Image im;
ImgDemoP()
{
setSize(400,300);
im=Toolkit.getDefaultToolkit().getImage("emoji.png");
setVisible(true);
}
public void paint(Graphics g)
{
g.drawImage(im,100,80,200,170,this);
}
public static void main(String args[])
{
ImgDemoP ob=new ImgDemoP();
}
}
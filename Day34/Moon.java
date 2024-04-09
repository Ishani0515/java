import java.awt.*;
class Moon extends Frame
{
    Moon()
    {
       
       setSize(300,300);
       setBackground(Color.BLACK);
       setVisible(true);
    }
   public void paint(Graphics g)
 {
       g.setColor(Color.gray);
       g.fillOval(50,60,80,80);
       g.setColor(Color.white);
       g.drawString("*",150,250);
       g.drawString("*",270,270);
       g.drawString("*",20,150);
       g.drawString("*",20,50);
       g.drawString("*",250,50);
       g.drawString("*",300,70);
       g.drawString("*",200,230);
       g.drawString("*",20,290);
       g.drawString("*",80,250);
       g.drawString("*",20,20);
       g.drawString("*",0,200);
       g.drawString("*",150,80);
 }
 
  public static void main(String args[])
   {
      Moon ob=new Moon();
   }
}

import java.awt.*;
class PhotoSlide extends Frame
{
   Label l; Font f;
   Image im;
   int i=6; 
   PhotoSlide()
   {
       setSize(300,300);
       l=new Label();
       setLayout(null);
        f=new Font("Arial",Font.BOLD, 30);
        l.setFont(f);  
       l.setBounds(90,200,200,60);
      add(l);
      setVisible(true);
      count();
   }
public void paint(Graphics g)
   {
      String img="pic"+i+".png";   
      im=Toolkit.getDefaultToolkit().getImage(img);
         g.drawImage(im,70,30,200,170,this);
   }
   void count() 
    {
      try{
          
         while(i>=1)
         {
             l.setText("pic"+i+".png");
             Thread.sleep(1000);
             i--;
             repaint();
           if(i==0)
             i=6;
         }
        }catch(InterruptedException e) {}
    }
public static void main(String args[])
   {
       PhotoSlide ob=new PhotoSlide();
   }
}
import java.awt.*;
import java.awt.event.*;
class ProjectKey extends Frame implements KeyListener
{
   Label l1,l2;
   int c=0;
    ProjectKey()
     {
        setSize(500,300);
        setTitle("SchoolDays");
        l1=new Label();
        l2=new Label();
        l1.setFont(new Font("Arial",Font.BOLD,50));
        l2.setFont(new Font("Arial",Font.BOLD,70));
        setLayout(null);
l1.setBounds(30,60,100,50);
        l2.setBounds(150,100,300,150);
        add(l1);add(l2);
        addKeyListener(this);
        setVisible(true);
     }
    public void keyPressed(KeyEvent e)
    {
           c++;
            if(c<2)
               l2.setForeground(Color.green);
           else if(c>2&&c<10)
                      l2.setForeground(Color.yellow);
     }
    public void keyReleased(KeyEvent e)
    {
    }
public void keyTyped(KeyEvent e)
   {
        char ch=e.getKeyChar();
        char sch=(char)(e.getKeyChar()-32);
         String res="";
         if(ch=='A'||ch=='a')
           res="Apple";
         else if(ch=='B'||ch=='b')
           res="Ball";
         else if(ch=='C'||ch=='c')
           res="Cat";
         else if(ch=='D'||ch=='d')
           res="Dog";
         else if(ch=='E'||ch=='e')
           res="Elephant";

        l1.setText(""+ch+sch); 
        l2.setText(res);   
    }
public static void main(String args[])
   {
      ProjectKey ob=new ProjectKey();
   }
}
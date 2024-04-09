import java.awt.*;
import java.util.*;
class WinV extends Frame
{
    WinV(int r,int g,int b)
    {
       setSize(300,300);
       Color c=new Color(r,g,b);
       setBackground(c);  
       setVisible(true);
    }
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter value of Red,Green,Blue:");
      int r=sc.nextInt();
      int g=sc.nextInt();
      int b=sc.nextInt();
      WinV ob=new WinV(r,g,b);
   }
}
import java.io.*;
import java.util.*;
class CountFile
{
   public static void main(String args[])
    {
      int c=0;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter filename to read:");
       String fname=sc.next();
        try
          {
               FileInputStream f=new FileInputStream(fname);
                int d;
                  while((d=f.read())!=-1)
                  {
                    c++;
                   System.out.print("\rTotal characters="+c);
Thread.sleep(100);
                 }
                f.close();    
          }
          catch(Exception e)
          {System.out.println(e);}
    }
}
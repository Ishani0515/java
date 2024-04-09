import java.io.*;
class RData
{
   public static void main(String args[])
    {
        try
          {
               FileInputStream f=new FileInputStream("file.txt");
                int d;
                  while((d=f.read())!=-1)
                  {
                   System.out.print((char)d);
                   Thread.sleep(200);
                  }
                f.close();    
          }
          catch(Exception e)
          {System.out.println(e);}
    }
}
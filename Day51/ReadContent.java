import java.io.*;
class ReadContent
{
   public static void main(String args[])
    {
        
         try
          {
               FileInputStream f=new FileInputStream("file.txt");
                int d=f.read();
                System.out.print((char)d);
                d=f.read();
                System.out.print((char)d);
                d=f.read();
                System.out.print((char)d);
                f.close();    
          }
          catch(IOException e)
{System.out.println(e);}
    }
}
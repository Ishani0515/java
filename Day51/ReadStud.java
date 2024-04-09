import java.io.*;
class ReadStud
{
   public static void main(String args[])
    {
        try
          {
               FileInputStream f=new FileInputStream("stud.txt");
                int d;
                  while((d=f.read())!=-1)
                  {
                   System.out.print((char)d);
                  }
                f.close();    
          }
          catch(IOException e)
          {System.out.println(e);}
    }
}
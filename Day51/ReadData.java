import java.io.*;
import java.util.*;
class ReadData
{
   public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter file name to read:");
       String fname=sc.next(); 
        try
          {
               FileInputStream f=new FileInputStream(fname);
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
import java.io.*;
class WriteB
{
   public static void main(String args[])
   {
      byte r[]="ABCDEF".getBytes();
      try
      {
       FileOutputStream f=new FileOutputStream("mydata.txt");
      for(byte val:r)
       f.write(val);
       f.close();
      }
      catch(IOException e){}
   }
}
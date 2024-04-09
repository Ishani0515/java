import java.io.*;
class PrintB
{
   public static void main(String args[])
   {
      byte r[]="ABCDEF".getBytes();
      for(byte val:r)
       System.out.print(val+" ");
   }
}
import java.io.*;
class Input
{
   public static void main(String args[]) throws IOException
   {
      System.out.print("Enter a character:");
      int ch=System.in.read();                   //A
       System.out.println("your value:"+ch);      //your value:65
       System.out.print("You have entered "+(char)ch);   //You have entered A
  }
}
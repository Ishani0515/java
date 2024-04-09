import java.io.*;
class WriteFile
{
   public static void main(String args[])
   {
         try
         {
            FileOutputStream f=new FileOutputStream("data.txt"); //create new file
            f.write('Z');
            f.close();
         }
         catch(IOException e){}
   }  
}
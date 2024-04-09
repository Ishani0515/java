import java.io.*;
class FileN
{
   public static void main(String args[])
   {
         try
         {
            FileOutputStream f=new FileOutputStream("anum.txt"); 
            f.write('X');
            f.write(65);
            f.write(97);
            f.write(49);
            f.close();
         }
         catch(IOException e){}
   }  
}
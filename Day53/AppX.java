import java.io.*;
class AppX
{
   public static void main(String args[])
   {
         try
         {
            FileOutputStream f=new FileOutputStream("abc.txt",true); //append data file
            f.write('X');
            f.write('Y');
            f.close();
         }
         catch(IOException e){}
   }  

}
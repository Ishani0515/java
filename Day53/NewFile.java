import java.io.*;
class NewFile
{
   public static void main(String args[])
   {
         try
         {
            FileOutputStream f=new FileOutputStream("mdata.txt"); //create new file
            f.close();
         }
         catch(IOException e){}
   }  
}
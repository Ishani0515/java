import java.io.*;
class WriteABC
{
   public static void main(String args[])
   {
         try
         {
            FileOutputStream f=new FileOutputStream("abc.txt");  //create new file
            f.write('A');
            f.write('B');
            f.write('C');
            f.close();
         }
         catch(IOException e){}
   }  
}

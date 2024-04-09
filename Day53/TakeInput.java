import java.io.*;
class TakeInput
{
    public static void main(String args[]) throws IOException
    {
         char c;
         InputStreamReader ir=new InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(ir);
         System.out.println("Enter characters and q for exit");
         do
          {
            c=(char)br.read();
            System.out.print(c);
          } while(c!='q');
         
    }
}
import java.io.*;
class StrInput
{
    public static void main(String args[]) throws IOException
    {
         InputStreamReader ir=new InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(ir);
         System.out.println("Enter Name:");
          String n=br.readLine();
            System.out.print("Welcome "+n);
    }
}
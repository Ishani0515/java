import java.io.*;
class SumTwo
{
    public static void main(String args[]) throws IOException
    {
         InputStreamReader ir=new InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(ir);
         System.out.println("Enter Two numbers:");
          String num1=br.readLine();
          String num2=br.readLine();
            System.out.print("Result="+(Integer.parseInt(num1)+Integer.parseInt(num2)));
         
    }
}
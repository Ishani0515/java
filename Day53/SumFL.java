import java.io.*;
class SumFL
{
    public static void main(String args[]) throws IOException
    {
         InputStreamReader ir=new InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(ir);
         System.out.println("Enter Two float numbers:");
          String num1=br.readLine();
          String num2=br.readLine();
            System.out.print("Result="+(Float.parseFloat(num1)+Float.parseFloat(num2)));
         
    }
}
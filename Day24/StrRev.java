import java.util.Scanner;
class StrRev
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter string:");
      String name=sc.next();           //welcome
      for(int i=name.length()-1;i>=0;i--)
        System.out.print(name.charAt(i)); 
   }
}
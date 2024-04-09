import java.util.Scanner;
class StrFun
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter string:");
      String name=sc.nextLine(); 
      for(int i=0;i<name.length();i++)
        System.out.print(name.charAt(i)+" "); 
   }
}

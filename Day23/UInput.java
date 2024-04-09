import java.util.Scanner;
class UInput
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter sentence:");
       String n=sc.nextLine();
       System.out.println("Length="+n.length());
   }
}
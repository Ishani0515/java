import java.util.Scanner;
class StudInfo
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Name:");
       String name=sc.nextLine();
       System.out.print("Enter Roll:");
       int roll=sc.nextInt();
       System.out.print("Enter Section:");
       String sec=sc.next();
       System.out.print("Enter Branch:");
       String branch=sc.next();
       System.out.println("Entered Data");
System.out.println(name+"   "+roll+"   "+sec+"   "+branch);
   }
}
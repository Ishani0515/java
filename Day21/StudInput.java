import java.util.Scanner;
class StudInput
{
   public static void main(String args[])
   {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter Name:");
        String n=ob.next();
        System.out.print("Enter Roll:");
        int r=ob.nextInt();
        System.out.print(n+"   "+r);
   }
}
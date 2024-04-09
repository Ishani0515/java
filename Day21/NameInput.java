import java.util.Scanner;
class NameInput
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter college Name:");
        String n=sc.nextLine();
        System.out.print("Enter full name:");
        String name=sc.nextLine();
        System.out.print(n+"   "+name);
   }
}
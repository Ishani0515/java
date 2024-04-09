import java.util.Scanner;
class FirstName
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first name:");
        String n=sc.next();
        System.out.println("Welcome "+n);
    }
}
import java.util.Scanner;
class SumThree
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number:");
        float n1=sc.nextFloat();
        System.out.print("Enter Second number:");
        float n2=sc.nextFloat();
        System.out.print("Enter Third number:");
        float n3=sc.nextFloat();
        System.out.print("Result="+(n1+n2+n3));
   }
}
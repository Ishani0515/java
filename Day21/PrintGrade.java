import java.util.Scanner;
class PrintGrade
{
   public static void main(String args[])
    {
            int m;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Marks:");
            m=sc.nextInt();
            if(m>=90 && m<=100)
              System.out.println("O");
            else if(m>=80 && m<=89)
              System.out.println("E");  
             else if(m>=70 && m<=79)
              System.out.println("A");
           else if(m>=60 && m<=69)
              System.out.println("B");
            else if(m>=50 && m<=59)
              System.out.println("C");
             else if(m>=40 && m<=49)
              System.out.println("D");
            else if(m>=0 && m<40)
             System.out.println("Fail");
            else
           System.out.println("Invalid");
    }
  }

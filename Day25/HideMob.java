import java.util.Scanner;
class HideMob
{
    public static void main(String args[])
     {    
       int c=0;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Your mobile no:");
       String s=sc.nextLine();   //My mobile no 9437920600             
       for(int i=0;i<s.length();i++)
          if(s.charAt(i)>='0'&&s.charAt(i)<='9')
             if(c<=1||c>=8)
             {
              System.out.print(s.charAt(i));
              c++;
             }
else
              {
              System.out.print("*");
               c++;
            }
        else
          System.out.print(s.charAt(i));
    }
}
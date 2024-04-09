import java.util.Scanner;
class MobHide
{
    public static void main(String args[])
     {    
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Your mobile no:");
       String s=sc.next();                
       for(int i=0;i<s.length();i++)
          if(s.charAt(i)>='0'&&s.charAt(i)<='9')
             if(i<=1||i>=8)
              System.out.print(s.charAt(i));
             else
              System.out.print("*");
    }
}


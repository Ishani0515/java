import java.util.*;
class HideNum
{
    public static void main(String args[])
     {    
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter sentence:");                        
       String s=sc.nextLine();                
       for(int i=0;i<s.length();i++)
          if(s.charAt(i)>='0'&&s.charAt(i)<='9')
             System.out.print("*");
           else
             System.out.print(s.charAt(i));
    }
}
import java.util.*;
class StrComp
{
    public static void main(String args[])
    {
       String pass="abcd";
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter password:");
       String s=sc.next();
        if(s.equals(pass)) 
         System.out.println("correct password");
        else
         System.out.println("Not correct password");
     }
}
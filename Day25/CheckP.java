import java.util.*;
class CheckP
{
    public static void main(String args[])
     {    
       int f=0;      
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Word:");                        
       String s=sc.next();                  //madam
       for(int i=0;i<s.length()/2;i++)                
           if(s.charAt(i)!=s.charAt(s.length()-1-i))
             f=1;
        System.out.println((f==0)?"Palindrome":"Not palindrome");
      }
}
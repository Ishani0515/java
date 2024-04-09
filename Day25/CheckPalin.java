import java.util.Scanner;
class CheckP
{
    public static void main(String args[])
     {    
       int f=0;      
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Word:");       0123456                
       String s=sc.next();                  //studuts
       for(int i=0;i<s.length()/2;i++)  //3
                    s[0]!=s[6]
                    s[1]!=s[5]
                    s[2]!=s[4]      
           if(s.charAt(i)!=s.charAt(s.length()-1-i))
             f=1;
        System.out.println((f==0)?"Palindrome":"Not palindrome");
      }
}


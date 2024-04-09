import java.util.Scanner;
class CheckOc
{
     public static void main(String args[])
     {    
       char alpha[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter string:");                        
       String s=sc.next().toLowerCase();       
       int c=0;
       for(int i=0;i<26;i++)
       {
           c=0;
           for(int j=0;j<s.length();j++)
if(s.charAt(j)==alpha[i]) 
                c++;
           System.out.print(c>0?" "+alpha[i]+"-"+c :"");      
       }
          
   }
}
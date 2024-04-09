import java.util.*;
class RSpace
{
    public static void main(String args[])
     {          
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter sentence:");                        
         String s=sc.nextLine();      
          String res[]=s.split(" ");
          String r="";
          for(int i=0;i<res.length;i++)
            r+=res[i]; 
         System.out.println(r);    
     }
}
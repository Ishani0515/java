import java.util.Scanner;
class StrVowelC
{
   public static void main(String args[])
   {
      int c=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter string:");
      String name=sc.next();              //welcome    
      for(int i=0;i<name.length();i++)
        if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') 
          c++;    
       System.out.println("Total vowel="+c);
   }
}
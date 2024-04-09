class CheckPalin
{
    public static void main(String args[])
    {              
      String ostr="madam"; 
      String rstr="";
       for(int i=ostr.length()-1;i>=0;i--)
          rstr=rstr+ostr.charAt(i);
      if(ostr.equals(rstr))
         System.out.println("Palindrome string");
       else
         System.out.println("Not Palindrome string");
      }
}
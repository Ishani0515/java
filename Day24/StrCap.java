class StrCap
{
   public static void main(String args[])
   {
      String name="welcome"; 
      int n;
      for(int i=0;i<name.length();i++)
       {
         n=(int)(name.charAt(i));
        if(i%2==0)
         System.out.print((char)(n-32)); 
        else
         System.out.print(name.charAt(i));
      }
   }
}
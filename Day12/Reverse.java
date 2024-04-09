class Reverse
{
   public static void main(String args[])
   {
         int dig,rev=0,n=8723; 
         while(n!=0)   
         {
            dig=n%10;        //dig=8
            rev=rev*10+dig;  //rev=3278
            n=n/10;          //n=0
         }
      System.out.println("Reverse="+rev);
   }
}
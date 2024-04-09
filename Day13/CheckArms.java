class CheckArms
{
   public static void main(String args[])
   {
         int dig,s=0,n=153;
         int num=n; 
         while(n!=0)   
         {
            dig=n%10;        //dig=8
            s=s+dig*dig*dig;  //rev=3278
            n=n/10;          //n=0
         }
        System.out.println(num==s?"Armstrong":"Not Armstrong");
    }
}
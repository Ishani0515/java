class FactNum
{
   public static void main(String args[])
   {
     int n=5;
     for(int i=1,f=1;i<=n;f*=i,System.out.print("\rFactorial="+f),i++);
   }
}
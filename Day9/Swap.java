class Swap
{
   public static void main(String args[])
   {
      int n1=10,n2=15;
       n1=n1^n2;
       n2=n1^n2;
       n1=n1^n2;
       System.out.println("n1="+n1);
       System.out.println("n2="+n2);
   }
}
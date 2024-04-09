class SumF
{
   float num1,num2;
    SumF(float n1,float n2)
     {
        num1=n1;
        num2=n2;
     }
   void sum()
   {
        System.out.println("Result="+(num1+num2));
   }
   public static void main(String args[])
   {
      SumF ob=new SumF(10.5f,2.6f);
      ob.sum();
   }
}
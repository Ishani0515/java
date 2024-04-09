class SimInt
{
   float siCalculate(int p,float r, float t)
   {
      float si=(p*r*t)/100;
       return si;
   }
   public static void main(String args[])
   {
       SimInt ob=new SimInt();
        float r=ob.siCalculate(10000,4.5f,5.0f);
       System.out.println("Simple Interest="+r);
   }
}
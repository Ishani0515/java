interface RBIRule
{
   float sroi=3.5f;
   void calSInterest(float p,float t);
   void calFInterest(float p,float t,float r);
}
class SBI implements RBIRule
{
    public void calSInterest(float p,float t)
    {
      System.out.println("Saving Interest="+(p*t*sroi)/100);
   
    }
    public void calFInterest(float p,float t,float r)
    {
      System.out.println("Fixed Interest="+(p*t*r)/100);
    }
    public static void main(String args[])
    {
       SBI c1=new SBI();
c1.calSInterest(10000.0f,3.0f);
       c1.calFInterest(10000.0f,3.0f,7.5f);

    }
}
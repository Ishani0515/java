class Bank
{
    private float roi=3.5f;
    public void calInt(int p,int t)
    {
      System.out.println("Interest="+ (p*roi*t)/100);
    }
}
class Customer extends Bank
{
     protected int p=10000;
     protected int t=3;
   
    public static void main(String args[])
    {
      Customer ob=new Customer();
      ob.calInt(ob.p,ob.t);
   }
}
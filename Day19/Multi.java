class MData
{
    int n1=10,n2=20;
}
class Add extends MData
{
    float n3=2.5f;
    void sum()
    {
      System.out.println("Addition="+(n1+n2+n3));   
    }
}
class Multi extends Add
{
   void multi()
   {
       System.out.println("Multi="+n1*n2*n3);
   }
   public static void main(String args[])
   {
       Multi ob=new Multi();
       ob.sum();
       ob.multi();
   }
}
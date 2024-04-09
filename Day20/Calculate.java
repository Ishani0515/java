class MData
{
   int n=10;
}
class Calculate extends MData
{
    void cal()
    {
       System.out.println("Square="+n*n);
       System.out.println("Cube="+n*n*n);
    }
   public static void main(String args[])
   {
       Calculate ob=new Calculate();
       ob.cal();
   }
}
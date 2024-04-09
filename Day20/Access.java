class Demo1
{
   private int n=10;
   private void show()
   {
         System.out.println(n);
   }
   public void disp()
   {
     show();
   }
}
class Access 
{
    public static void main(String args[])
    {
       Demo1 ob=new Demo1();
       ob.disp();
    }
}
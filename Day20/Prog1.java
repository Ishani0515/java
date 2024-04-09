class Dummy
{
   private int n1=10;
   private int n2=100;
   public void show()
   {
     System.out.println(n1);
     System.out.println(n2);
   }
 }
class Prog1 extends Dummy
{
   public static void main(String args[])
   {
     Prog1 ob=new Prog1();
     ob.show();
   }
}
class MyProg
{
   public int n1=10;
   private int n2=100;
   
}
class Prog extends MyProg
{
   public static void main(String args[])
   {
     Prog ob=new Prog();
     System.out.println(ob.n1);
     //System.out.println(ob.n2);
   }
}
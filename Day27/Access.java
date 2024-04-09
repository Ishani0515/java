abstract class Main
{
   static int n=10;
   static void show()
   {
       System.out.println("Show");
    }
}
class Access
{
   public static void main(String args[])
   {
        Main.show();
        System.out.println("n="+Main.n);
   }
}
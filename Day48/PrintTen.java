class PrintTen implements Runnable
{
   public void run()
   {
      for(int i=1;i<=10;i++)
       System.out.print(" "+i);
   }
   public static void main(String args[])
   {
        PrintTen ob=new PrintTen();
        Thread t=new Thread(ob);
        t.start();
   }
}
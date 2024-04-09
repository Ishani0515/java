class ConsDemo
{
   int n;
   ConsDemo(int num)
   {
      n=num;
      System.out.println("parameter Constructor is executed..");
   }
   void show()
   {
      System.out.println("n="+n);
   }
   public static void main(String args[])
   {
      ConsDemo ob=new ConsDemo(10);
      ob.show();
      ConsDemo ob1=new ConsDemo(20);
      ob1.show();
   }
}
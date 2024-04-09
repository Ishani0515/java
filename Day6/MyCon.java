class Mycon
{
   void convert(char ch)
   {
       int r=ch-32;
       System.out.println((char)r);
   }
   public static void main(String args[])
   {
       Mycon ob=new Mycon();
       ob.convert('b');
   }
}
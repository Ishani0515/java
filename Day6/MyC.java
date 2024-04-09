class MyC
{
   int sum(int n1,int n2)
   {
       return n1+n2;
   }
   public static void main(String args[])
   {
       MyC ob=new MyC();
       System.out.println(ob.sum(10,20));
        int r=ob.sum(16,78);
       System.out.println(r);
   }
}
class SumVal
{
    static int n1=10;   //static variable
    int n2=7;           //instance variable
    public static void main(String args[])
    {
       SumVal ob=new SumVal();
       System.out.println("Sum="+(n1+ob.n2));
    }
}
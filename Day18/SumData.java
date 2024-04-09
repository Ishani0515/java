class SumData extends MData
{
    int n3=30;
     void add()
     {
        System.out.println("Addition="+(n1+n2+n3));
     }
     void multi()
     {
       System.out.println("Addition="+(n1*n2*n3));
     }
    public static void main(String args[])
    {
        SumData ob=new SumData();
         ob.add();
         ob.multi();
    }
}
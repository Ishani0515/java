class MData
{
    int n1=10,n2=20;
}
class CalData extends MData
{
    int n3=90;
     void sum()
     {
          System.out.print("Result="+(n1+n2+n3));
     }
    public static void main(String args[])
    {
       CalData ob=new CalData();
        ob.sum();
    }
}
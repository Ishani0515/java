class IData
{
   int n=100;
}
class MyData extends IData
{
    int n=300;
    void show()
    {
        int n=500;
         System.out.println(super.n+" "+this.n+"  "+n);
    }
    public static void main(String args[])
    {
      MyData ob =new MyData();
      ob.show();
    }
}
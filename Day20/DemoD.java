class DemoB
{
    DemoB(char ch)
    {
        System.out.println("I am parameter constructor of  DemoB");
    }
}
class DemoD extends DemoB
{
    DemoD()
    {
         
         System.out.println("I am default constructor of DemoD");
         super('B');
    }
    public static void main(String args[])
    {
      DemoD ob =new DemoD();
    }
}
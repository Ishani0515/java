class ThisD
{
 ThisD()
{
 this(10);
 System.out.println("Default constructor..");
}
ThisD(int n)
{

System.out.println("Parameter Constructor.with 1 parameter");
}
public static void main(String args[])
{
  ThisD ob=new ThisD();
}
}
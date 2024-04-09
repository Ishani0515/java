class This
{
This()
{
this(10);
System.out.println("Default Constructor..");
}
This(int n)
{
System.out.println("Parameter Constructor");
}
public static void main(String args[])
{
This ob=new This();
}
}
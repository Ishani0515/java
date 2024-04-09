class CountObject
{
static int c;
CountObject()
{
c++;
}
public static void main(String args[])
{
CountObject ob1=new CountObject();
CountObject ob2=new CountObject();
CountObject ob3=new CountObject();
System.out.println("Total number of objects="+c);
System.out.println(ob1.c+" "+ob2.c+" "+ob3.c);
}
}

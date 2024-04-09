class Demo
{
int n=20;  //instance var
void show()
{
int n=50;  //local var
System.out.println(n);  //access local var
System.out.println(this.n); //access instance
}
public static void main(String args[])
{
Demo ob=new Demo();
ob.show();
}
}
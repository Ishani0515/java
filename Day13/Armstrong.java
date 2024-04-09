class Armstrong
{
public static void main(String args[])
{
int s=0,dig,n=153;
int num=n;
while(n!=0)
{
dig=n%10;
s=s+dig*dig*dig;
n=n/10;
}
System.out.print(num==s?"Armstrong":"Notarmstrong");
}
}
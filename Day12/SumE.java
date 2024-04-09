class SumE
{
public static void main(String args[])
{
int n=4562,s=0,dig;
for(int i=4532;i!=0;i=i/10)
{
dig=i%10;
if(dig%2==0)
s=s+dig;
}
System.out.print("Sum of even digit="+s);
}
}

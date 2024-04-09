class Perfect
{
public static void main(String args[])
{
int n=6,s=0;
for(int i=1;i<n;i++)
if(i%n==0)
s=s+i;
System.out.print(n==s?"Perfect number":"Not Perfect");
}
}
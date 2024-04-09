class CheckPerfect
{
public static void main(String args[])
{
int i=1,n=6,s=0;
while(i<n)
{
if(n%1==0)
s=s+i;
i++;
}
System.out.println(s==n?"Perfect Number":"Not Perfect Number");
}
}
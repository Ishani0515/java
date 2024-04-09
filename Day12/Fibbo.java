class Fibbo
{
public static void main (String args[])
{
int first=0,second=1,sum,n=8;
System.out.print(first+" "+second+" ");
while (n>2)
{
sum=first +second;
System.out.print(" "+sum);
first=second;
second=sum;
n--;
}
}
}

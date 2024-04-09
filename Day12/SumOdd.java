class SumOdd
{
     public static void main(String args[])
     {

int i=1,s=0;
while(i<=10)
{
if(i%2!=0)
s=s+i;
i++;
}
System.out.print("Odd Sum Result="+s);
}
}
//19 29 39 49 59 69 79 89

class FunSeries
{
public static void main(String args[])
{
for (int i=19,j=1;i<=89;i=i+10,j++)
{
if(j%2!=0)
System.out.print(i/10+" ");
else
System.out.print(i%10+" ");
}
}
}
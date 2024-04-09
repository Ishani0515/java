class SumD
{
  public static void main(String args[])
 {
   int n=453,s=0;
for(int i=n;i!=0;i=i/10)
s=s+i%10;

System.out.print("Sum of digit="+s);
}
}
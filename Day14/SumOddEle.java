class SumOddEle
{
  public static void main(String args[])
  {
       int num[]={11,5,23,10,4,2,7,12},s=0;
       for(int i=0;i<num.length;i++)
        if(num[i]%2!=0) 
           s=s+num[i];
       System.out.print("Sum of odd elements= "+s);
  }
}
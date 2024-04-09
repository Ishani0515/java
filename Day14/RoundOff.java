class RoundOff
{
     public static void main(String args[])
     {
         float num[]={2.3f,4.6f,1.6f,5.4f,7.9f,1.2f};
         int n=0;
         for(int i=0;i<num.length;i++)
          {
             n=(int)num[i];      
             System.out.print( num[i]-n>=0.5f?(n+1)+" ":n+" ");
          }
     }
}
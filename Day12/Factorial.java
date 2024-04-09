
class Factorial
{
     public static void main(String args[])
     {
        int i=1,f=1,n=5;
        do                      
        {
          f=f*i;    
          i++;
        }while(i<=n);    
       System.out.print(" Factorial Result ="+f);
     }
}
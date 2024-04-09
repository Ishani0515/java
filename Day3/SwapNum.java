class SwapNum
{
     public static void main(String args[])
     {
          int n1=10,n2=50;
          System.out.println("Before swap n1="+n1);
          System.out.println(" n2="+n2);
          n1=n1+n2;   //60
          n2=n1-n2;   //10
          n1=n1-n2;   //50
          System.out.println("After swap n1="+n1);
          System.out.println(" n2="+n2);
     }
}
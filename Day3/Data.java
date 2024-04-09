class Data
  {
     int n1=10;        //instance variable
     float n2=10.5f;
     public static void main(String args[])
      {
           Data ob=new Data();     //object creation
          System.out.println("n1="+ob.n1);   //n1=10 access instance variable
          System.out.println("n2="+ob.n2);
      }
  }
class TwoIns
{
   int n1,n2;
   TwoIns(int num1,int num2)
   {
      n1=num1;
      n2=num2;
      System.out.println("parameter Constructor is executed..");
   }
   public static void main(String args[])
   {
      TwoIns ob1=new TwoIns(10,20);
      TwoIns ob2=new TwoIns(200,300);
      TwoIns ob3=new TwoIns(600,7000);
      System.out.println("Values in ob1"+ ob1.n1+"  "+ob1.n2);
      System.out.println("Values in ob2"+ ob2.n1+"  "+ob2.n2);
      System.out.println("Values in ob3"+ ob1.n1+"  "+ob3.n2);
   }
}
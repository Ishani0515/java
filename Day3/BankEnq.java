class BankEnq
{
   String name;
   float p,r,t;
   public static void main(String args[])
   {
      BankEnq c1=new BankEnq();
      c1.name="Suchitra";
      c1.p=10000.0f;
      c1.r=3.5f;
      c1.t=5.0f;
      BankEnq c2=new BankEnq();
      c2.name="Simran";
      c2.p=12000.0f;
      c2.r=6.5f;
      c2.t=10.0f;
      System.out.println(c1.name+"  Interest=   "+(c1.p*c1.r*c1.t)/100);
      System.out.println(c2.name+"   Interest= "+(c2.p*c2.r*c2.t)/100);  
   }
}


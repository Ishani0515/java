class ConsPar
{
    int n;
    ConsPar(int num)
    {
        n=num;
        System.out.println("parameter constructor is executed...");
    }
   public static void main(String args[])
   {
     ConsPar ob1=new ConsPar(5);
     ConsPar ob2=new ConsPar(10);
     System.out.println(ob1.n+"   "+ob2.n);  
   }
}
class ShowPi
{
   float getPi()
   {
       return 3.142f;
   }
   public static void main(String args[])
   {
       ShowPi ob=new ShowPi();
       System.out.println(ob.getPi());
        float r=ob.getPi();
       System.out.println(r);
   }
}
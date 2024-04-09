class MBase
{
    MBase()
    {
       System.out.println("MBase Constructor");
    }
}
class MDerived extends MBase
{
   public static void main(String args[])
   {
      MDerived ob=new MDerived();
      System.out.println("I am main of MDerived");
   }
}
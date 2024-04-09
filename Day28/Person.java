interface ShopRule
{
    void showSR();
}
interface BusRule
{
   void showBR();
}
interface CovidRule extends ShopRule,BusRule
{
   void showCR();
}
class Person implements CovidRule
{
     public void showSR()
     {
      System.out.println("Wear Mask and maintain distance");
     }
     public void showBR()
      {
       System.out.println("maintain distance and sit properly");
      }
     public void showCR()
     {
       System.out.println("Stay Home and Stay safe");
     }
public static void main(String args[])
   {
        Person ob=new Person();
        ob.showSR(); ob.showBR(); ob.showCR();
   }
}
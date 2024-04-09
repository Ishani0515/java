class Vechicle implements TraficRule
{
   public void twoWheelerRule()
   {
       System.out.println("Wear Halmet");
       System.out.println("Ride with standard speed");
     } 
   public void fourWheelerRule()
    {
      System.out.println("use Seatbelt");
      System.out.println("Obey Trafficlight rule");
   }
   public static void main(String args[])
   {
         //Vechicle ob=new Vechicle();   
         TraficRule ob=new Vechicle();
         ob.twoWheelerRule();
ob.fourWheelerRule();
   }
}
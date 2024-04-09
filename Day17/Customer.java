class Hotel
{
     void room()
     {
        System.out.println("Room cost Rs 2500");
        System.out.println("Double bed");
        System.out.println("Fully Airconditioned");
     }
     void check()
     {
         System.out.println("Checkin and checkout time is 12.00");
     }
}
class Customer extends Hotel
{
    void custDetails()
     {
        System.out.println("Name Akash");
        System.out.println("City Bhubaneswar");
     }
    public static void main(String args[])
    {
Customer ob=new Customer();
        ob.room();
        ob.check();
       ob.custDetails();
    }
}
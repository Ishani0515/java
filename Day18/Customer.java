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
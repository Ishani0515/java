interface StateRule
{
    void borderCheck();
}
interface CityRule extends StateRule
{
    void marketRule();
}
class Customer implements CityRule
{
    public void borderCheck()
    {
      System.out.println("Customer must be vaccinated");
    }
    public void marketRule()
    {
        System.out.println("Maintain 2 mtr distance during shoping\n avoid crowd");
    }
    public void show()
   {}
    public static void main(String args[])
    {
       Customer ob=new Customer();
ob.borderCheck();
       ob.marketRule();
       ob.show();
    }   
}
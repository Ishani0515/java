class DivDemo
{
    public static void main(String args[])
    {
       try
        {
         System.out.println("Result="+10/2);
         System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
           System.out.println("You can not divide number by zero");
        }
        finally
        {
          System.out.println("Thank You");
        }
    }
}
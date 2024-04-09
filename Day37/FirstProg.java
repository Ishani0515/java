class FirstProg
{
    public static void main(String args[])
    {
      try
       {
       System.out.println("Hello");
       System.out.println("Thank You");
       System.out.println(10/0);
       }
       catch(ArithmeticException e)
       {
         System.out.println("You can not divide number by zero");
        
       } 
    }
}